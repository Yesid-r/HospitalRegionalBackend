package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Doctor;
import com.example.demo.repositories.IARepositoryDoctor;

@Service
public class DoctorService {

	@Autowired
	private IARepositoryDoctor iaRepositoryDoctor;
	
	public Doctor saveDoctor(Doctor doctor) {
		iaRepositoryDoctor.save(doctor);
		return doctor;
	}

	public List<Doctor> listDoctors() {
		
		return iaRepositoryDoctor.findAll();
	}

	public Doctor actualizarDoctor(Doctor doctor) {
		return iaRepositoryDoctor.save(doctor);
		
	}
	
}
