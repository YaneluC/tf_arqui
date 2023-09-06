package pe.edu.upc.demo_tp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo_tp.entities.Personas;

@Repository
public interface IPersonasRepository extends JpaRepository<Personas, Integer>{

}
