package com.repasofiltro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.repasofiltro.entity.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Integer> {
	@Query ("select e from Personal e where e.nombres like ?1 and (e.trabajo like?2) and (e.correo like ?3) and (?4 is -1 or e.region.idregion like ?4)")
	public abstract List<Personal> listapersonal(String nombre, String trabajo , String correo , int pais );

}
	