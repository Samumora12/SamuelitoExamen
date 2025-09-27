package com.example.parcial2.modelos;

import com.example.parcial2.ayudas.Ciudad;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "detalles_cine")
public class DetalleCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dirreccion", length = 50, unique = false, nullable = false)
    private String direccion;

    @Enumerated(EnumType.STRING)
    @Column(name = "ciudad", length = 50, unique = false, nullable = false)
    private Ciudad ciudad;

    @Column(name = "telefono", unique = false, nullable = false)
    private Integer telefono;

    @OneToOne
    @JoinColumn(name = "fk_cine", referencedColumnName = "id")
    @JsonManagedReference(value="relacionempresariousuario")
    private Cine cine;

    public DetalleCine(Integer id, String direccion, Ciudad ciudad) {
        this.id = id;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
