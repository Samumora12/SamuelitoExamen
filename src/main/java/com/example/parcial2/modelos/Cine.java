package com.example.parcial2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cines")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 50, nullable = false, unique = false)
    private String nombre;

    @Column(name = "nit", length = 50, nullable = false, unique = false)
    private String nit;

    @OneToOne(mappedBy = "cine")
    @JsonBackReference(value="relacionempresariousuario")
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine")
    @JsonBackReference(value="relacionCineSala")
    private List<Sala> salas;

    public Cine(Integer id, String nombre, String nit) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}