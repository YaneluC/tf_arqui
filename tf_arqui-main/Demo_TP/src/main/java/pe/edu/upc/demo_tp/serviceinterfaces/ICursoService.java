package pe.edu.upc.demo_tp.serviceinterfaces;
import pe.edu.upc.demo_tp.entities.Curso;
import java.util.List;
public interface ICursoService {
    public void insert (Curso curso);
    public List<Curso> list();
    public void delete(int idCurso);
}
