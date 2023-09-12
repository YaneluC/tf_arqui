package pe.edu.upc.demo_tp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.Profesores;
import pe.edu.upc.demo_tp.repositories.IProfesoresRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.IProfesoresService;

import java.util.List;

@Service
public class ProfesoresServiceImplement implements IProfesoresService {
    @Autowired
    private IProfesoresRepository pR;

    @Override
    public void insert(Profesores profesores) {pR.save(profesores);}
    @Override
    public List<Profesores> list(){return pR.findAll();}

    @Override
    public void delete(int idProfesores) {pR.deleteById(idProfesores);}

    


}
