package pe.edu.upc.demo_tp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo_tp.entities.Curso;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer> {
}
