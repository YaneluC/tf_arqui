package pe.edu.upc.aaw.tf_arq_web.entities;

import javax.persistence.Column;
import java.time.LocalDate;

public class Universidad {
  
    private int idUniversidad;
    private String codUniversidad;
    private String nombreUniversidad;

    public Universidad() {
    }

    public Universidad(int idUniversidad, String codUniversidad, String nombreUniversidad) {
        this.idUniversidad = idUniversidad;
        this.codUniversidad = codUniversidad;
        this.nombreUniversidad = nombreUniversidad;
    }

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
