package pe.edu.upc.demo_tp.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.CarrerasProfesionales;
import pe.edu.upc.demo_tp.repositories.ICarrerasProfesionalesRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.ICarrerasProfesionalesService;
import java.util.List;
@Service
public class CarrerasProfesionalesServiceImplement implements ICarrerasProfesionalesService{
    @Autowired
    private ICarrerasProfesionalesRepository pR;

    @Override
    public void insert(CarrerasProfesionales carrerasProfesionales) {pR.save(carrerasProfesionales);}
    @Override
    public List<CarrerasProfesionales> list(){return pR.findAll();}

    @Override
    public void delete(int idCarrerasProfesionales) {pR.deleteById(idCarrerasProfesionales);}


}
