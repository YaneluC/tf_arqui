package pe.edu.upc.demo_tp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Criterio")
public class Criterio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCriterio;
    @Column(name = "codCriterio",length = 100, nullable = false)
    private String codCriterio;
    @Column(name = "nombreCriterio",length = 100,nullable = false)
    private String nombreCriterio;
    @Column(name = "puntuacionCriterio", nullable = false)
    private int puntuacionCriterio;
    @Column(name = "idCalificacionDocente",nullable = false)
    private int idCalificacionDocente;

    public Criterio() {
    }

    public int getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(int idCriterio) {
        this.idCriterio = idCriterio;
    }

    public String getCodCriterio() {
        return codCriterio;
    }

    public void setCodCriterio(String codCriterio) {
        this.codCriterio = codCriterio;
    }

    public String getNombreCriterio() {
        return nombreCriterio;
    }

    public void setNombreCriterio(String nombreCriterio) {
        this.nombreCriterio = nombreCriterio;
    }

    public int getPuntuacionCriterio() {
        return puntuacionCriterio;
    }

    public void setPuntuacionCriterio(int puntuacionCriterio) {
        this.puntuacionCriterio = puntuacionCriterio;
    }

    public int getIdCalificacionDocente() {
        return idCalificacionDocente;
    }

    public void setIdCalificacionDocente(int idCalificacionDocente) {
        this.idCalificacionDocente = idCalificacionDocente;
    }

    public Criterio(int idCriterio, String codCriterio, String nombreCriterio, int puntuacionCriterio, int idCalificacionDocente) {
        this.idCriterio = idCriterio;
        this.codCriterio = codCriterio;
        this.nombreCriterio = nombreCriterio;
        this.puntuacionCriterio = puntuacionCriterio;
        this.idCalificacionDocente = idCalificacionDocente;
    }
}
