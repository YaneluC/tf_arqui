package pe.edu.upc.demo_tp.serviceinterfaces;

import java.util.List;
import pe.edu.upc.demo_tp.entities.Criterio;
public interface ICriterioService {
    public void insert(Criterio criterio);
    public List<Criterio> list();
    public void delete(int idCriterio);
}
