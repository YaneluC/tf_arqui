package pe.edu.upc.demo_tp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo_tp.dtos.CursoDTO;
import pe.edu.upc.demo_tp.entities.Curso;
import pe.edu.upc.demo_tp.serviceinterfaces.ICursoService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private ICursoService ps;
    @PostMapping
    public void registrar(@RequestBody CursoDTO dto){
        ModelMapper m=new ModelMapper();
        Curso c= m.map(dto, Curso.class);
        ps.insert(c);
    }
    @GetMapping
    public List<CursoDTO>listar(){
        return ps.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CursoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){ps.delete(id);}
    @PutMapping
    public void modificar(@RequestBody CursoDTO dto){
        ModelMapper m=new ModelMapper();
        Curso c=m.map(dto,Curso.class);
        ps.insert(c);
    }
}
