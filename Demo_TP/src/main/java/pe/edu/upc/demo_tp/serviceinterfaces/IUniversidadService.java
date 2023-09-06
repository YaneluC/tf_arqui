package pe.edu.upc.aaw.tf_arq_web.serviceinterfaces;

import pe.edu.upc.aaw.tf_arq_web.entities.Universidad;

import java.util.List;

public interface IUniversidadService {
    public void insert(Universidad universidad);
    public List<Universidad> list();
}
