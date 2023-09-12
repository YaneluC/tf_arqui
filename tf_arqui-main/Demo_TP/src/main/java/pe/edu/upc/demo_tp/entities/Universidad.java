package pe.edu.upc.demo_tp.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Universidad")
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversidad;
    @Column(name = "codUniversidad", length = 45, nullable = false)
    private String codUniversidad;
    @Column(name = "nombreUniversidad", length = 45, nullable = false)
    private String nombreUniversidad;

    public Universidad() {
    }

    public Universidad(int idUniversidad, String codUniversidad, String nombreUniversidad) {
        this.idUniversidad = idUniversidad;
        this.codUniversidad = codUniversidad;
        this.nombreUniversidad = nombreUniversidad;
    }

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getCodUniversidad() {
        return codUniversidad;
    }

    public void setCodUniversidad(String codUniversidad) {
        this.codUniversidad = codUniversidad;
    }

    public String nombreUniversidad() {
        return nombreUniversidad;
    }

    public void setnombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }
}
