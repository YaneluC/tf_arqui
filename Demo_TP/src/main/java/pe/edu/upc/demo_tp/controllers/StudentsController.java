package pe.edu.upc.aaw.tf_web.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.tf_web.dtos.StudentsDTO;
import pe.edu.upc.aaw.tf_web.entities.Students;
import pe.edu.upc.aaw.tf_web.serviceinterfaces.IStudentsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private IStudentsService sS;

    @PostMapping
    public void registrar(@RequestBody StudentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Students s = m.map(dto, Students.class);
        sS.insert(s);
    }

    @GetMapping
    public List<StudentsDTO> listar() {
        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, StudentsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sS.delete(id);
    }

}
