package com.ashley.driverslicense.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashley.driverslicense.models.License;
import com.ashley.driverslicense.models.Person;
import com.ashley.driverslicense.repositories.LicenseRepository;
import com.ashley.driverslicense.repositories.PersonRepository;

@Service
public class DMVService {
	// Shorter way of doing dependency injection
	@Autowired
	private PersonRepository pRepo;
	@Autowired
	private LicenseRepository lRepo;
	
//	private final PersonRepository pRepo;
//	private final LicenseRepository lRepo;
//	public DMVService(PersonRepository pRepo, LicenseRepository lRepo) {
//		this.pRepo = pRepo;
//		this.lRepo = lRepo;
//	}
	
	public Person createPerson(Person newPerson) {
		return this.pRepo.save(newPerson);
	}
	
	public Person getOnePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Person> getAllPeople() {
		return this.pRepo.findAll();
	}
	
	public List<Person> getUnlicensedPeople(){
		return this.pRepo.findByLicenseIdIsNull();
	}
	
	public License createLicense(License license) {
		license.setNumber(this.generateLicenseNumber());
		return this.lRepo.save(license);
	}
	
	public int generateLicenseNumber() {
		License l = this.lRepo.findTopByOrderByNumberDesc();
		if(l == null) {
			return 1;
		}
		int previousLicenseNumber = l.getNumber();
		previousLicenseNumber++;
		return (previousLicenseNumber);
	}
}
