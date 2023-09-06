package pe.edu.upc.aaw.tf_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_web.entities.Students;
import pe.edu.upc.aaw.tf_web.repositories.IStudentsRepository;
import pe.edu.upc.aaw.tf_web.serviceinterfaces.IStudentsService;

import java.util.List;

@Service
public class StudentsServiceImplement implements IStudentsService {
    @Autowired
    private IStudentsRepository sR;

    @Override
    public void insert(Students students) {
        sR.save(students);
    }

    @Override
    public List<Students> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int idStudents) {
        sR.deleteById(idStudents);
    }
}
