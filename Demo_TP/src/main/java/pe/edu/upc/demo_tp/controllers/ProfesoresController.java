package pe.edu.upc.demo_tp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo_tp.dtos.ProfesoresDTO;
import pe.edu.upc.demo_tp.entities.Profesores;
import pe.edu.upc.demo_tp.serviceinterfaces.IProfesoresService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/profesores")
public class ProfesoresController {
    @Autowired
    private IProfesoresService pS;

    @PostMapping
    public void registrar(@RequestBody ProfesoresDTO dto) {
        ModelMapper m = new ModelMapper();
        Profesores p = m.map(dto, Profesores.class);
        pS.insert(p);

    }
    @GetMapping
    public List<ProfesoresDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ProfesoresDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}

   
    @PutMapping
    public void modificar(@RequestBody ProfesoresDTO dto){
        ModelMapper m = new ModelMapper();
        Profesores p = m.map(dto,Profesores.class);
        pS.insert(p);
    }

}
