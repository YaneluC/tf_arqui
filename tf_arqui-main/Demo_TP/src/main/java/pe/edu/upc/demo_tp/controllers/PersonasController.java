package pe.edu.upc.demo_tp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo_tp.dtos.PersonasDTO;
import pe.edu.upc.demo_tp.entities.Personas;
import pe.edu.upc.demo_tp.serviceinterfaces.IPersonasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/personas")
public class PersonasController {
    @Autowired
    private IPersonasService pS;

    @PostMapping
    public void registrar(@RequestBody PersonasDTO dto) {
        ModelMapper m = new ModelMapper();
        Personas p = m.map(dto, Personas.class);
        pS.insert(p);

    }
    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<PersonasDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PersonasDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}


    @PutMapping
    public void modificar(@RequestBody PersonasDTO dto){
        ModelMapper m = new ModelMapper();
        Personas p = m.map(dto,Personas.class);
        pS.insert(p);
    }

}
