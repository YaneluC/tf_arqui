package pe.edu.upc.demo_tp.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.Universidad;
import pe.edu.upc.demo_tp.repositories.IUniversidadRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.IUniversidadService;

import java.util.List;

@Service
public class UniversidadServiceImplement implements IUniversidadService{

    @Autowired
    private IUniversidadRepository aR;
    @Override
    public void insert(Universidad universidad) {
        aR.save(universidad);
    }

    @Override
    public List<Universidad> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idUniversity) {
        aR.deleteById(idUniversity);
    }
}
