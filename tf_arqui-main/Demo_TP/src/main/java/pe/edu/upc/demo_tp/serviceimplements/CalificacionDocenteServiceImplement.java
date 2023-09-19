package pe.edu.upc.demo_tp.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.CalificacionDocente;
import pe.edu.upc.demo_tp.repositories.ICalificacionDocenteRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.ICalificacionDocenteService;
import java.util.List;
@Service
public class CalificacionDocenteServiceImplement implements ICalificacionDocenteService {
        @Autowired
        private ICalificacionDocenteRepository cdR;
        @Override
        public void insert(CalificacionDocente calificacionDocente) {cdR.save(calificacionDocente);}
        @Override
        public List<CalificacionDocente> list(){return cdR.findAll();}
        @Override
        public void delete(int idCalificacionDocente){cdR.deleteById(idCalificacionDocente);}
}
