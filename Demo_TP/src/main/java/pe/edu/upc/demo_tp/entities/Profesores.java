package pe.edu.upc.demo_tp.entities;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Profesores")
public class Profesores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    @Column(name = "codProfesor",length = 45,nullable = false)
    private String codProfesor;
    @Column(name = "nombre",length = 45,nullable = false)
    private String nombre;
    @Column(name = "apellido",length = 45,nullable = false)
    private String apellido;

    public Profesores(){

    }
    public Profesores(int idProfesor, String codProfesor, String nombre, String apellido) {
        this.idProfesor = idProfesor;
        this.codProfesor = codProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




}
