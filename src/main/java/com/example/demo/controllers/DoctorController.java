package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Doctor;
import com.example.demo.services.DoctorService;

@RestController
@CrossOrigin
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/saveDoctor")
	public Doctor saveDoctor(Doctor octor) {
		return doctorService.saveDoctor(octor);
	}
	
	@GetMapping("/listDoctors")
	public List<Doctor> listDoctors(){
		return doctorService.listDoctors();
	}
	
}
