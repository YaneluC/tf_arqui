package pe.edu.upc.demo_tp.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo_tp.entities.CalificacionDocente;

@Repository
public interface ICalificacionDocenteRepository extends JpaRepository<CalificacionDocente, Integer>{
}
