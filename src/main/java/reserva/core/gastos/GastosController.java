package reserva.core.gastos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/gastos")
@CrossOrigin({"*"})

public class GastosController 
{
   //Consumir el servicio
   @Autowired
   private GastosService service;

    @GetMapping("/{id}/")
    public Gastos findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Gastos> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Gastos save( @RequestBody Gastos entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Gastos update ( @RequestBody Gastos entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
