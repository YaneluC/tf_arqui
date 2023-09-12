package pe.edu.upc.demo_tp.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.Students;
import pe.edu.upc.demo_tp.repositories.IStudentsRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.IStudentsService;

import java.util.List;

@Service
public class StudentsServiceImplement implements IStudentsService {
    @Autowired
    private IStudentsRepository pR;

    @Override
    public void insert(Students students) {
        pR.save(students);
    }

    @Override
    public List<Students> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idStudents) {
        pR.deleteById(idStudents);
    }
}
