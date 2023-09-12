package pe.edu.upc.demo_tp.serviceinterfaces;

import pe.edu.upc.demo_tp.entities.Students;

import java.util.List;

public interface IStudentsService {
    public void insert(Students students);
    public List<Students> list();
    public void delete(int idStudents);
}
