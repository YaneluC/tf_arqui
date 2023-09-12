package pe.edu.upc.demo_tp.dtos;

public class UniversidadDTO {
  
    private int idUniversidad;
    private String codUniversidad;
    private String nombreUniversidad;
  

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public String getCodUniversidad() {
        return codUniversidad;
    }

    public void setCodUniversidad(String codUniversidad) {
        this.codUniversidad = codUniversidad;
    }

    public String nombreUniversidad() {
        return nombreUniversidad;
    }

    public void setnombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }
}
