package modelos;

@Entity
@Table(name = "detalles_cine")
public class DetalleCine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String direccion;
    private String ciudad;
    private String telefono;

    @OneToOne
    @JoinColumn(name = "cine_id", nullable = false, unique = true)
    private Cine cine;
}
