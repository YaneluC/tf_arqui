package pe.edu.upc.demo_tp.dtos;
public class CalificacionDocenteDTO {
    private int idCalificacionDocente;
    private String codCalificacionDocente;
    private String codAlumno;
    private int Valoracion;
    private String codUniversidad;
    private String codProfesor;
    private String codCurso;
    private String codCarreraProfesional;
    private String recomendacion;

    public CalificacionDocenteDTO(int idCalificacionDocente, String codCalificacionDocente, String codAlumno, int valoracion, String codUniversidad, String codProfesor, String codCurso, String codCarreraProfesional, String recomendacion) {
        this.idCalificacionDocente = idCalificacionDocente;
        this.codCalificacionDocente = codCalificacionDocente;
        this.codAlumno = codAlumno;
        Valoracion = valoracion;
        this.codUniversidad = codUniversidad;
        this.codProfesor = codProfesor;
        this.codCurso = codCurso;
        this.codCarreraProfesional = codCarreraProfesional;
        this.recomendacion = recomendacion;
    }

    public int getIdCalificacionDocente() {
        return idCalificacionDocente;
    }

    public void setIdCalificacionDocente(int idCalificacionDocente) {
        this.idCalificacionDocente = idCalificacionDocente;
    }

    public String getCodCalificacionDocente() {
        return codCalificacionDocente;
    }

    public void setCodCalificacionDocente(String codCalificacionDocente) {
        this.codCalificacionDocente = codCalificacionDocente;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public int getValoracion() {
        return Valoracion;
    }

    public void setValoracion(int valoracion) {
        Valoracion = valoracion;
    }

    public String getCodUniversidad() {
        return codUniversidad;
    }

    public void setCodUniversidad(String codUniversidad) {
        this.codUniversidad = codUniversidad;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getCodCarreraProfesional() {
        return codCarreraProfesional;
    }

    public void setCodCarreraProfesional(String codCarreraProfesional) {
        this.codCarreraProfesional = codCarreraProfesional;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }
}
