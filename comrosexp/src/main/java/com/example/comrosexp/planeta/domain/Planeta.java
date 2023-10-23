package com.example.comrosexp.planeta.domain;
import jakarta.persistence.*;


@Entity
@Table(name = "planeta")
public class Planeta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre_planeta;

    private Double gravedad_planeta;

    private Integer cant_dia;

    private Double distancia;

    private Boolean habitado;


    public Planeta() {}

    public Planeta(Long id, String nombre_planeta, Double gravedad_planeta, Integer cant_dia, Double distancia, Boolean habitado) {
        this.id = id;
        this.nombre_planeta = nombre_planeta;
        this.gravedad_planeta = gravedad_planeta;
        this.cant_dia = cant_dia;
        this.distancia = distancia;
        this.habitado = habitado;
    }


    // Getters y setters
    public Long getId(){
        return this.id;
    }
    public String getNombre() {
        return this.nombre_planeta;
    }

    public Double getGravedad() {
        return this.gravedad_planeta;
    }

    public Integer getCantDia() {
        return this.cant_dia;
    }

    public Double getDistancia() {
        return this.distancia;
    }

    public Boolean isHabitado() {
        return this.habitado;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNombre(String nombre_planeta) {
        if (nombre_planeta == null || nombre_planeta.trim().isEmpty()) {
            throw new IllegalArgumentException("El planeta no puede ser nulo o vacío.");
        }
        this.nombre_planeta = nombre_planeta;
    }

    public void setGravedad(Double gravedad_planeta) {
        if (gravedad_planeta == null) {
            throw new IllegalArgumentException("No puede haber un planeta sin gravedad.");
        }
        this.gravedad_planeta = gravedad_planeta;
    }

    public void setCantDia(Integer cant_dia) {
        if (cant_dia == null) {
            throw new IllegalArgumentException("No está permitido cant_día vacío.");
        }
        this.cant_dia = cant_dia;
    }

    public void setDistancia(Double distancia) {
        if (distancia == null){
            throw new IllegalArgumentException("No se permite distancias nulos.");
        }
        this.distancia = distancia;
    }

    public void isHabitado(Boolean habitado) {
        this.habitado = habitado;
    }
}
