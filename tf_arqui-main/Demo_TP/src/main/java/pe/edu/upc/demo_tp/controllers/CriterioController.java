package pe.edu.upc.demo_tp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo_tp.entities.Criterio;
import pe.edu.upc.demo_tp.dtos.CriterioDTO;
import pe.edu.upc.demo_tp.serviceinterfaces.ICriterioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/criterio")
public class CriterioController {
    @Autowired
    private ICriterioService ps;
    @PostMapping
    public void registrar(@RequestBody CriterioDTO dto){
        ModelMapper m=new ModelMapper();
        Criterio c=m.map(dto,Criterio.class);
        ps.insert(c);
    }
    @GetMapping
    public List<CriterioDTO>listar(){
        return ps.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CriterioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){ps.delete(id);}
    @PutMapping
    public void modificar(@RequestBody CriterioDTO dto){
        ModelMapper m=new ModelMapper();
        Criterio c=m.map(dto,Criterio.class);
        ps.insert(c);
    }
}
