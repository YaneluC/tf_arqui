package pe.edu.upc.demo_tp.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo_tp.dtos.UniversidadDTO;
import pe.edu.upc.demo_tp.entities.Universidad;
import pe.edu.upc.demo_tp.serviceinterfaces.IUniversidadService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Universidad")
public class UniversidadController {
    @Autowired
    private IUniversidadService pS;
    @PostMapping
    public void registrar(@RequestBody UniversidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Universidad p = m.map(dto, Universidad.class);
        pS.insert(p);

    }
    @GetMapping
    public List<UniversidadDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UniversidadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}


    @PutMapping
    public void modificar(@RequestBody UniversidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Universidad p = m.map(dto, Universidad.class);
        pS.insert(p);
    }
}
