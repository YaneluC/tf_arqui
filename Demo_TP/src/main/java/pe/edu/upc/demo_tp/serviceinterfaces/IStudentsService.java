package pe.edu.upc.aaw.tf_web.serviceinterfaces;

import pe.edu.upc.aaw.tf_web.entities.Students;

import java.util.List;

public interface IStudentsService {
    public void insert(Students students);
    public List<Students> list();
    public void delete(int idStudents);
}
