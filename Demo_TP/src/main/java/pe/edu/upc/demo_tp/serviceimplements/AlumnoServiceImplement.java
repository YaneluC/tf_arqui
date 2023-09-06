package pe.edu.upc.aaw.tf_arq_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_arq_web.entities.Alumnos;
import pe.edu.upc.aaw.tf_arq_web.repositories.IAlumnosRepository;
import pe.edu.upc.aaw.tf_arq_web.serviceinterfaces.IAlumnosService;

import java.util.List;

@Service
public class AlumnoServiceImplement implements IAlumnosService {
    @Autowired
    private IAlumnosRepository aR;
    @Override
    public void insert(Alumnos alumnos) {
        aR.save(alumnos);
    }

    @Override
    public List<Alumnos> list() {
        return aR.findAll();
    }
}
