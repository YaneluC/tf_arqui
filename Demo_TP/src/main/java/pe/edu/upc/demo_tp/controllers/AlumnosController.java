package pe.edu.upc.aaw.tf_arq_web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.tf_arq_web.dtos.AlumnosDTO;
import pe.edu.upc.aaw.tf_arq_web.entities.Alumnos;
import pe.edu.upc.aaw.tf_arq_web.serviceinterfaces.IAlumnosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Alumnos")
public class AlumnosController {
    @Autowired
    private IAlumnosService aS;
    @PostMapping
    public void registrar(@RequestBody AlumnosDTO dto) {
        ModelMapper m= new ModelMapper();
        Course c=m.map(dto, Alumnos.class);
        aS.insert(c);
    }

    @GetMapping
    public List<AlumnosDTO> listar() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AlumnosDTO.class);
        }).collect(Collectors.toList());
    }
}
