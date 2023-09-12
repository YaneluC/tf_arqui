package pe.edu.upc.demo_tp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    @Column(name = "codCurso", length = 45,nullable = false)
    private String codCurso;
    @Column(name = "nombreCurso", length = 80,nullable = false)
    private String nombreCurso;

    public Curso() {

    }

    public Curso(int idCurso, String codCurso, String nombreCurso) {
        this.idCurso = idCurso;
        this.codCurso = codCurso;
        this.nombreCurso = nombreCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
}
