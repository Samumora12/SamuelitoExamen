package modelos;

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
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine")
    private List<Sala> salas;
}