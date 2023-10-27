package com.example.backend.trabajador.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "trabajador")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    
    @Column(name = "dni", nullable = false, unique = true)
	private String dni;

    public String apellidoPaterno;

    private String apellidoMaterno;

    private String nombrePila;

    private String imagen;

    private String genero;

    private Date fechaNacimiento;

    private Integer edad;

    @Column(name="password", length = 255)
    private String password;

    public Trabajador() {}

    public Trabajador(String password, Long id, String dni, String apellidoPaterno, String apellidoMaterno, String nombrePila, String imagen, String genero, Date fechaNacimiento, Integer edad) {
        this.id = id;
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombrePila = nombrePila;
        this.imagen = imagen;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.password = password;
    }
}
