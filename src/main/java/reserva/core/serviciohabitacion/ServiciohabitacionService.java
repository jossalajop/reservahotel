package reserva.core.serviciohabitacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciohabitacionService {
    //Consumir el Repository
    @Autowired
    ServiciohabitacionRepository repository;

    public Serviciohabitacion save( Serviciohabitacion entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Serviciohabitacion findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Serviciohabitacion> findAll(){
        return repository.findAll();
    }
}
