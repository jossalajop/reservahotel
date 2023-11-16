package reserva.core.usuario;

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
@RequestMapping("/app/usua")
@CrossOrigin({"*"})

public class UsuarioController 
{
   //Consumir el servicio
   @Autowired
   private UsuarioService service;

    @GetMapping("/{id}/")
    public Usuario findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/")
    public List<Usuario> findAll(){
        return service.findAll();
    }

    @PostMapping("/")
    public Usuario save( @RequestBody Usuario entity ){
        return service.save(entity);
    }

    @PutMapping("/")
    public Usuario update ( @RequestBody Usuario entity ){
        return service.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        service.deleteById(id);
    }
}