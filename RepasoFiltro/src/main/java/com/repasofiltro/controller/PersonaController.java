package com.repasofiltro.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.repasofiltro.Service.PersonalService;
import com.repasofiltro.Utils.Constantes;
import com.repasofiltro.entity.Personal;

@RestController
@RequestMapping ("/trabajo/personal")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

	@Autowired PersonalService perservi;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Personal>> listapersonal(){
		List<Personal> lista= perservi.listaPersonal();
		return ResponseEntity.ok(lista);
	}
	@PostMapping
	@ResponseBody 
	public ResponseEntity<Map<String, Object>> insertaPersonal(@RequestBody Personal obj){
		Map<String, Object> salida = new HashMap<>();
		try {
			Personal objSalida = perservi.insertyActualiza(obj);
			if (objSalida == null) {
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		}
		return ResponseEntity.ok(salida);
	}
	@GetMapping("/filtro")
	@ResponseBody
	public ResponseEntity<List<Personal>> listapersonalfiltro(
			@RequestParam(name = "nombres", required = false , defaultValue = "")String nombre,
			@RequestParam(name = "trabajo", required = false , defaultValue = "")String trabajo,
			@RequestParam(name = "correo", required = false , defaultValue = "")String correo,
			@RequestParam(name = "region", required = false , defaultValue = "-1")int pais
			){
		List<Personal> lista= perservi.listaPersonal(nombre+"%", trabajo+"%", "%"+correo+"%", pais);
		return ResponseEntity.ok(lista);
				
	}
}
