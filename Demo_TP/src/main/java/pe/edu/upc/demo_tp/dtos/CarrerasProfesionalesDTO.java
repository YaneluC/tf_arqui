package pe.edu.upc.aaw.demo_tp.dtos;


import javax.persistence.*;

public class CarrerasProfesionales {
 
    private int idCarreraProfesional;
    private String codCarreraProfesional;
    private String nombreCarreraProfesional;
    private int idUniversidad;

    public CarrerasProfesionales() {
    }

    public CarrerasProfesionales(int idCarreraProfesional, String codCarreraProfesional, String nombreCarreraProfesional, String idUniversidad) {
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

    public String getidUniversidad() {
        return idUniversidad;
    }

    public void idUniversidad(String idUniversidad) {
        this.idUniversidad = idUniversidad;
    }
}
