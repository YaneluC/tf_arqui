package pe.edu.upc.demo_tp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codAdministrador;
    @Column(name = "idUsuario",nullable = false)
    private int idUsuario;

    public Administrador() {
    }

    public int getCodAdministrador() {
        return codAdministrador;
    }

    public void setCodAdministrador(int codAdministrador) {
        this.codAdministrador = codAdministrador;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Administrador(int codAdministrador, int idUsuario) {
        this.codAdministrador = codAdministrador;
        this.idUsuario = idUsuario;
    }
}
