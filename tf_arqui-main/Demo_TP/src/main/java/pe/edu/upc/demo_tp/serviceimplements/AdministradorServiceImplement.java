package pe.edu.upc.demo_tp.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.Administrador;
import pe.edu.upc.demo_tp.repositories.IAdministradorRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.IAdministradorService;

import java.util.List;

@Service
public class AdministradorServiceImplement implements IAdministradorService {
    @Autowired
    private IAdministradorRepository pR;
    @Override
    public void insert(Administrador administrador) {pR.save(administrador);}
    @Override
    public List<Administrador>list(){return pR.findAll();}
    @Override
    public void delete(int idAdministrador){pR.deleteById(idAdministrador);}
}
