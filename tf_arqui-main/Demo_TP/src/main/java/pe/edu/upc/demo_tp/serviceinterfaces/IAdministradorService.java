package pe.edu.upc.demo_tp.serviceinterfaces;

import pe.edu.upc.demo_tp.entities.Administrador;

import java.util.List;

public interface IAdministradorService {
    public void insert(Administrador administrador);
    public List<Administrador> list();
    public void delete(int idAdministrador);
}
