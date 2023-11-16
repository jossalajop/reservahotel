package reserva.core.paquetehabitacion;

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
@RequestMapping("/app/paquetehabitacion")
@CrossOrigin({"*"})

public class PaquetehabitacionController 
{
   //Consumir el servicio
   @Autowired
   private PaquetehabitacionService service;

    @GetMapping("/{id}/")
    public Paquetehabitacion findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Paquetehabitacion> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Paquetehabitacion save( @RequestBody Paquetehabitacion entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Paquetehabitacion update ( @RequestBody Paquetehabitacion entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
