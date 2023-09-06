package pe.edu.upc.aaw.tf_arq_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.tf_arq_web.entities.Universidad;
@Repository

public interface IUniversidadRepository extends JpaRepository<Universidad,Integer> {

}
