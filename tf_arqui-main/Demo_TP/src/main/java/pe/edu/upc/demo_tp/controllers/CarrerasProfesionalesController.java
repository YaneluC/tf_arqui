package pe.edu.upc.demo_tp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo_tp.dtos.CarrerasProfesionalesDTO;
import pe.edu.upc.demo_tp.entities.CarrerasProfesionales;
import pe.edu.upc.demo_tp.serviceinterfaces.ICarrerasProfesionalesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/CarrerasProfesionales")
public class CarrerasProfesionalesController {
    @Autowired
    private ICarrerasProfesionalesService pS;

    @PostMapping
    public void registrar(@RequestBody CarrerasProfesionalesDTO dto) {
        ModelMapper m = new ModelMapper();
        CarrerasProfesionales p = m.map(dto, CarrerasProfesionales.class);
        pS.insert(p);

    }
    @GetMapping
    public List<CarrerasProfesionalesDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,CarrerasProfesionalesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}


    @PutMapping
    public void modificar(@RequestBody CarrerasProfesionalesDTO dto){
        ModelMapper m = new ModelMapper();
        CarrerasProfesionales p = m.map(dto,CarrerasProfesionales.class);
        pS.insert(p);
    }

}
