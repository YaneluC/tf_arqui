package pe.edu.upc.demo_tp.serviceinterfaces;

import pe.edu.upc.demo_tp.entities.Profesores;

import java.util.List;

public interface IProfesoresService {
    public void insert(Profesores profesores);
    public List<Profesores> list();
    public void delete(int idProfesores);
 
}
