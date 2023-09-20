package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.Solicitud;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud,Integer> {

}
