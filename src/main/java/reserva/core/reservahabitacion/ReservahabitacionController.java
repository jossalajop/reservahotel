package reserva.core.reservahabitacion;

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
@RequestMapping("/app/reservaha")
@CrossOrigin({"*"})

public class ReservahabitacionController 
{
   //Consumir el servicio
   @Autowired
   private ReservahabitacionService service;

    @GetMapping("/{id}/")
    public Reservahabitacion findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Reservahabitacion> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Reservahabitacion save( @RequestBody Reservahabitacion entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Reservahabitacion update ( @RequestBody Reservahabitacion entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
