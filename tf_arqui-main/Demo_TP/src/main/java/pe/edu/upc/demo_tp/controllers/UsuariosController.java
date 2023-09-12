package pe.edu.upc.demo_tp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo_tp.dtos.UsuariosDTO;
import pe.edu.upc.demo_tp.entities.Usuarios;
import pe.edu.upc.demo_tp.serviceinterfaces.IUsuariosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private IUsuariosService pS;

    @PostMapping
    public void registrar(@RequestBody UsuariosDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuarios p = m.map(dto, Usuarios.class);
        pS.insert(p);

    }
    @GetMapping
    public List<UsuariosDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UsuariosDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}


    @PutMapping
    public void modificar(@RequestBody UsuariosDTO dto){
        ModelMapper m = new ModelMapper();
        Usuarios p = m.map(dto,Usuarios.class);
        pS.insert(p);
    }

}
