package pe.edu.upc.demo_tp.dtos;

public class CriterioDTO {
    private int idCriterio;
    private String codCriterio;
    private String nombreCriterio;
    private int puntuacionCriterio;
    private int idCalificacionDocente;

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
}
