package pe.edu.upc.demo_tp.serviceinterfaces;

import pe.edu.upc.demo_tp.entities.Usuarios;

import java.util.List;

public interface IUsuariosService {
    public void insert(Usuarios personas);
    public List<Usuarios> list();
    public void delete(int idPersonas);

}
