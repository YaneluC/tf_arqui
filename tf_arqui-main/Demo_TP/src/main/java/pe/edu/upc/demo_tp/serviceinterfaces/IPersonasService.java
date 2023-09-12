package pe.edu.upc.demo_tp.serviceinterfaces;

import pe.edu.upc.demo_tp.entities.Personas;

import java.util.List;

public interface IPersonasService {
    public void insert(Personas personas);
    public List<Personas> list();
    public void delete(int idPersonas);

}
