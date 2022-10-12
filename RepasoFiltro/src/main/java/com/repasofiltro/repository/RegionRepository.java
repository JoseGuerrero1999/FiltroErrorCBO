package com.repasofiltro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.repasofiltro.entity.Region;

public interface RegionRepository extends JpaRepository<Region, Integer> {

	@Query ("select distinct x.pais from Region x order by 1 asc")
	public abstract List<String>listadodepaises();
}
