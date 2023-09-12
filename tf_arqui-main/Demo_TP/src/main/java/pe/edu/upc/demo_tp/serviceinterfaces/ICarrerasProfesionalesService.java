package pe.edu.upc.demo_tp.serviceinterfaces;
import pe.edu.upc.demo_tp.entities.CarrerasProfesionales;
import java.util.List;
public interface ICarrerasProfesionalesService {
    public  void insert(CarrerasProfesionales carrerasProfesionales);
    public List<CarrerasProfesionales> list();
    public void  delete(int idCarrerasProfesionales);
}
