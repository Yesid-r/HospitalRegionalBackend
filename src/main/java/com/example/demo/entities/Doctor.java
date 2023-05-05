package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctores")
public class Doctor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "especialidad")
    private String especialidad;
    
    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;
    
    @OneToMany(mappedBy = "doctor")
    private List<Cita> citas;
    
    public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(Long id, String nombre, String especialidad, String numeroIdentificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}
    
	
    // Getters y setters
}
