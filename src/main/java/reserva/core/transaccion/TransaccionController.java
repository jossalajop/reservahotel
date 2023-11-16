package reserva.core.transaccion;

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
@RequestMapping("/app/entidad")
@CrossOrigin({"*"})

public class TransaccionController 
{
   //Consumir el servicio
   @Autowired
   private TransaccionService service;

    @GetMapping("/{id}/")
    public Transaccion findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Transaccion> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Transaccion save( @RequestBody Transaccion entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Transaccion update ( @RequestBody Transaccion entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
