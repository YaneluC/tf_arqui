package pe.edu.upc.demo_tp.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Personas")
public class Personas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;
    @Column(name = "usuario",length = 45,nullable = false)
    private String usuario;
    @Column(name = "contraseña",length = 45,nullable = false)
    private String contraseña;
    @Column(name = "correo",length = 45,nullable = false)
    private String correo;
    @Column(name = "telefono",length = 9,nullable = false)
    private String telefono;
    @Column(name="fechanac",nullable = false)
    private LocalDate fechanac;
    @Column(name = "nombre",length = 45,nullable = false)
    private String nombre;
    @Column(name = "apellido",length = 45,nullable = false)
    private String apellido;

    public Personas(){

    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
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

    public Personas(int idPersona, String usuario, String contraseña, String correo, String telefono, LocalDate fechanac, String nombre, String apellido) {
        this.idPersona = idPersona;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.telefono = telefono;
        this.fechanac = fechanac;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
