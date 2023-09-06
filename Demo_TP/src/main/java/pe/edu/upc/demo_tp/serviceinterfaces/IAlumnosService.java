package pe.edu.upc.aaw.tf_arq_web.serviceinterfaces;

import pe.edu.upc.aaw.tf_arq_web.entities.Alumnos;

import java.util.List;

public interface IAlumnosService {
    public  void insert(Alumnos alumnos);
    public List<Alumnos> list();
}
