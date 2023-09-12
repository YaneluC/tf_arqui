package pe.edu.upc.demo_tp.entities;


import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "CarrerasProfesionales")
public class CarrerasProfesionales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCarreraProfesional;
    @Column(name = "codCarreraProfesional",length = 10,nullable = false)
    private String codCarreraProfesional;
    @Column(name = "nombreCarreraProfesional",length = 100,nullable = false)
    private String nombreCarreraProfesional;
    @Column(name = "idUniversidad",length=10,nullable = false)
    private int idUniversidad;

    public CarrerasProfesionales() {
    }

    public CarrerasProfesionales(int idCarreraProfesional, String codCarreraProfesional, String nombreCarreraProfesional, int idUniversidad) {
        this.idCarreraProfesional = idCarreraProfesional;
        this.codCarreraProfesional = codCarreraProfesional;
        this.nombreCarreraProfesional = nombreCarreraProfesional;
        this.idUniversidad = idUniversidad;
    }

    public int getidCarreraProfesional() {
        return idCarreraProfesional;
    }

    public void setidCarreraProfesional(int idCarreraProfesional) {
        this.idCarreraProfesional = idCarreraProfesional;
    }

    public String getcodCarreraProfesional() {
        return codCarreraProfesional;
    }

    public void setcodCarreraProfesional(String codCarreraProfesional) {
        this.codCarreraProfesional = codCarreraProfesional;
    }

    public String getnombreCarreraProfesional() {
        return nombreCarreraProfesional;
    }

    public void setnombreCarreraProfesional(String nombreCarreraProfesional) {
        this.nombreCarreraProfesional = nombreCarreraProfesional;
    }

    public int getidUniversidad() {
        return idUniversidad;
    }

    public void idUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }
}
