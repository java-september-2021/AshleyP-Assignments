package com.ashley.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashley.dojosandninjas.models.Dojo;
import com.ashley.dojosandninjas.models.Ninja;
import com.ashley.dojosandninjas.repositories.DojoRepository;
import com.ashley.dojosandninjas.repositories.NinjaRepository;

@Service
public class DojoNinjaService {
	@Autowired
	private final DojoRepository dojoRepo;
	@Autowired
	private final NinjaRepository ninjaRepo;
	public DojoNinjaService(DojoRepository dRepo, NinjaRepository nRepo) {
		this.dojoRepo = dRepo;
		this.ninjaRepo = nRepo;
	}
	public Dojo createDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	public Ninja createNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}
	public List<Dojo> allDojos() {
		return this.dojoRepo.findAll();
	}
	public Dojo findDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
}
