package pe.edu.upc.demo_tp.serviceinterfaces;
import pe.edu.upc.demo_tp.entities.CalificacionDocente;
import java.util.List;
public interface ICalificacionDocenteService {
    public  void insert(CalificacionDocente calificacionDocente);
    public List<CalificacionDocente> list();
    public void  delete(int idCalificacionDocente);
}
