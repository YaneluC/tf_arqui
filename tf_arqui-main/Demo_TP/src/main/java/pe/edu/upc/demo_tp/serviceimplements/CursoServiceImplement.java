package pe.edu.upc.demo_tp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.Curso;
import pe.edu.upc.demo_tp.repositories.ICursoRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.ICursoService;

import java.util.List;

@Service
public class CursoServiceImplement implements ICursoService {
    @Autowired
    private ICursoRepository pR;
    @Override
    public void insert(Curso curso){pR.save(curso);}
    @Override
    public List<Curso>list(){return pR.findAll();}
    @Override
    public void delete(int idCurso){pR.deleteById(idCurso);}
}
