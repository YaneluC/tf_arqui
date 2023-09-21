package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.Usuarios;

import java.util.List;

@Repository
public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer>{
    @Query(value = "select nombre, apellido, fechanac from Usuarios order by fechanac asc",nativeQuery = true)
    public List<String[]> ordensegunfechanacimiento();
}

