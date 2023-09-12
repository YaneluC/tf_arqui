package pe.edu.upc.demo_tp.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.Criterio;
import pe.edu.upc.demo_tp.repositories.ICriterioRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.ICriterioService;

import java.util.List;

@Service
public class CriterioServiceImplement implements ICriterioService {
    @Autowired
    private ICriterioRepository pR;
    @Override
    public void insert(Criterio criterio){pR.save(criterio);}

    @Override
    public List<Criterio>list(){return pR.findAll();}
    @Override
    public void delete(int idCriterio){pR.deleteById(idCriterio);}
}
