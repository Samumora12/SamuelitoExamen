package com.example.parcial2.modelos;

import com.example.parcial2.ayudas.Tipo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombreSala", length = 50, nullable = false, unique = false)
    private String nombreSala;

    @Column(name = "nombre", nullable = false, unique = false)
    private Integer capacidad;

    @Column(name = "tipo", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "fk_cine", referencedColumnName = "id")
    @JsonManagedReference(value = "relacionCineSala")
    private Cine cine;

    public Sala(Integer id, String nombreSala, Integer capacidad) {
        this.id = id;
        this.nombreSala = nombreSala;
        this.capacidad = capacidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }


}
