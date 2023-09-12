package pe.edu.upc.demo_tp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo_tp.entities.Usuarios;
import pe.edu.upc.demo_tp.repositories.IUsuariosRepository;
import pe.edu.upc.demo_tp.serviceinterfaces.IUsuariosService;

import java.util.List;

@Service
public class UsuariosServiceImplement implements IUsuariosService {
    @Autowired
    private IUsuariosRepository pR;

    @Override
    public void insert(Usuarios usuarios) {pR.save(usuarios);}
    @Override
    public List<Usuarios> list(){return pR.findAll();}

    @Override
    public void delete(int idUsuario) {pR.deleteById(idUsuario);}



}
