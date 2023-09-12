package pe.edu.upc.demo_tp.dtos;

public class CarrerasProfesionalesDTO {
    private int idCarreraProfesional;
    private String codCarreraProfesional;
    private String nombreCarreraProfesional;
    private int idUniversidad;




    public CarrerasProfesionalesDTO(int idCarreraProfesional, String codCarreraProfesional, String nombreCarreraProfesional, int idUniversidad) {
        this.idCarreraProfesional = idCarreraProfesional;
        this.codCarreraProfesional = codCarreraProfesional;
        this.nombreCarreraProfesional = nombreCarreraProfesional;
        this.idUniversidad = idUniversidad;
    }

    public int getIdCarreraProfesional() {
        return idCarreraProfesional;
    }

    public void setIdCarreraProfesional(int idCarreraProfesional) {
        this.idCarreraProfesional = idCarreraProfesional;
    }

    public String getCodCarreraProfesional() {
        return codCarreraProfesional;
    }

    public void setCodCarreraProfesional(String codCarreraProfesional) {
        this.codCarreraProfesional = codCarreraProfesional;
    }

    public String getNombreCarreraProfesional() {
        return nombreCarreraProfesional;
    }

    public void setNombreCarreraProfesional(String nombreCarreraProfesional) {
        this.nombreCarreraProfesional = nombreCarreraProfesional;
    }

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }


}
