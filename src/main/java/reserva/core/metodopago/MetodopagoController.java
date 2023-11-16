package reserva.core.metodopago;

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
@RequestMapping("/app/metodo")
@CrossOrigin({"*"})

public class MetodopagoController 
{
   //Consumir el servicio
   @Autowired
   private MetodopagoService service;

    @GetMapping("/{id}/")
    public Metodopago findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Metodopago> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Metodopago save( @RequestBody Metodopago entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Metodopago update ( @RequestBody Metodopago entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}