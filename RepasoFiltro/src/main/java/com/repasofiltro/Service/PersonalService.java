package com.repasofiltro.Service;

import java.util.List;

import com.repasofiltro.entity.Personal;

public interface PersonalService {

	public abstract List<Personal> listaPersonal();
	public abstract Personal insertyActualiza (Personal obj);
	public abstract List<Personal> listaPersonal(String nombre, String trabajo , String correo , int pais );
}
