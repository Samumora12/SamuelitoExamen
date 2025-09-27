package modelos;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "salas")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 50, nullable = false, unique = false)
    private String nombre;

    @Column(name = "nombre", length = 50, nullable = false, unique = false)
    private Integer capacidad;

    @Column(name = "tipo", length = 50, nullable = false, unique = false)
    private String tipo; // 2D, 3D, IMAX...

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cine_id", nullable = false)
    private Cine cine;
}
