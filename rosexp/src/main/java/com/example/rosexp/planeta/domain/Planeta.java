package com.example.backend.planeta.domain;


import jakarta.persistence.*;


@Entity
@Table(name = "planeta")
public class Planeta {
    @Id
    @Column(name = "nombre_planeta", nullable = false, unique = true)
    private String nombre_planeta;

    private Double gravedad_planeta;

    private Integer cant_dia;

    private Double distancia;

    private Boolean habitado;


    public Planeta() {}

    public Planeta(String nombre_planeta, Double gravedad_planeta, Integer cant_dia, Double distancia, Boolean habitado) {
        this.nombre_planeta = nombre_planeta;
        this.gravedad_planeta = gravedad_planeta;
        this.cant_dia = cant_dia;
        this.distancia = distancia;
        this.habitado = habitado;
    }


    // Getters y setters
    public String getNombre() {
        return nombre_planeta;
    }

    public Double getGravedad() {
        return gravedad_planeta;
    }

    public Integer getCantDia() {
        return cant_dia;
    }

    public Double getDistancia() {
        return distancia;
    }

    public Boolean isHabitado() {
        return habitado;
    }


    public void setNombre(String nombre_planeta) {
        this.nombre_planeta = nombre_planeta;
    }

    public void setGravedad(Double gravedad_planeta) {
        this.gravedad_planeta = gravedad_planeta;
    }

    public void setCantDia(Integer cant_dia) {
        this.cant_dia = cant_dia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public void isHabitado(Boolean habitado) {
        this.habitado = habitado;
    }
}
