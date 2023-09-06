package pe.edu.upc.aaw.tf_arq_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.tf_arq_web.entities.Universidad;
import pe.edu.upc.aaw.tf_arq_web.repositories.IUniversidadRepository;
import pe.edu.upc.aaw.tf_arq_web.serviceinterfaces.IUniversidadService;

import java.util.List;

@Service
public class UniversidadServiceImplement implements IUniversidadService {
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
}
