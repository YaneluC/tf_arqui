package pe.edu.upc.aaw.tf_arq_web.dtos;

public class AlumnosDTO {
    private int idAlumnos;

    private String codUniversity;

    private String idPersona;


    private String codAlumnos;
    private String codCarrera;

    public int getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(int idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public String getCodUniversity() {
        return codUniversity;
    }

    public void setCodUniversity(String codUniversity) {
        this.codUniversity = codUniversity;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getCodAlumnos() {
        return codAlumnos;
    }

    public void setCodAlumnos(String codAlumnos) {
        this.codAlumnos = codAlumnos;
    }

    public String getCodCarrera() {
        return codCarrera;
    }

    public void setCodCarrera(String codCarrera) {
        this.codCarrera = codCarrera;
    }
}
