package reserva.core.habitaciones;

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
@RequestMapping("/app/habitaciones")
@CrossOrigin({"*"})

public class HabitacionesController 
{
   //Consumir el servicio
   @Autowired
   private HabitacionesService service;

    @GetMapping("/{id}/")
    public Habitaciones findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Habitaciones> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Habitaciones save( @RequestBody Habitaciones entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Habitaciones update ( @RequestBody Habitaciones entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}
