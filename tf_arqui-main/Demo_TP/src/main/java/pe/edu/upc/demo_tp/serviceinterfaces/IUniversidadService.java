package pe.edu.upc.demo_tp.serviceinterfaces;

import pe.edu.upc.demo_tp.entities.Universidad;


import java.util.List;

public interface IUniversidadService {
    public void insert(Universidad universidad);
    public List<Universidad> list();

    public void delete(int idUniversity);
}
