package pe.edu.upc.aaw.tf_arq_web.serviceinterfaces;

import pe.edu.upc.aaw.tf_arq_web.entities.CarrerasProfesionales;

import java.util.List;

public interface ICarrerasProfesionalesService {
    public  void insert(CarrerasProfesionales carrerasProfesionales);
    public List<CarrerasProfesionales> list();
}
