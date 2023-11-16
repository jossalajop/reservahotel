package reserva.core.paquetehabitacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaquetehabitacionService {
    //Consumir el Repository
    @Autowired
    PaquetehabitacionRepository repository;

    public Paquetehabitacion save( Paquetehabitacion entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Paquetehabitacion findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Paquetehabitacion> findAll(){
        return repository.findAll();
    }
}
