package pe.edu.upc.demo_tp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.Personas;
import pe.edu.upc.demo_tp.repositories.IPersonasRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.IPersonasService;

import java.util.List;

@Service
public class PersonasServiceImplement implements IPersonasService {
    @Autowired
    private IPersonasRepository pR;

    @Override
    public void insert(Personas personas) {pR.save(personas);}
    @Override
    public List<Personas> list(){return pR.findAll();}

    @Override
    public void delete(int idPersonas) {pR.deleteById(idPersonas);}

    @Override
    public Personas listId(int idPersonas) {
        return pR.findById(idPersonas).orElse(new Personas());
    }


}
