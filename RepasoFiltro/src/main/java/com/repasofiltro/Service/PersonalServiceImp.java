package com.repasofiltro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repasofiltro.entity.Personal;
import com.repasofiltro.repository.PersonalRepository;
@Service
public class PersonalServiceImp implements PersonalService{

	@Autowired
	private PersonalRepository repopers;
	
	@Override
	public List<Personal> listaPersonal() {
		return repopers.findAll();
	}

	@Override
	public Personal insertyActualiza(Personal obj) {
		return repopers.save(obj);
	}

	@Override
	public List<Personal> listaPersonal(String nombre, String trabajo, String correo, int pais) {
		return repopers.listapersonal(nombre, trabajo, correo, pais);
	}

	
}
