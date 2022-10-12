package com.repasofiltro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repasofiltro.repository.RegionRepository;
@Service
public class RegionServiceImp implements RegionService{

	@Autowired
	private RegionRepository reporegi;

	@Override
	public List<String> listadodepaises() {
		return reporegi.listadodepaises();
	}
	
}
