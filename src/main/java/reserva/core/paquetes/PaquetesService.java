package reserva.core.paquetes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaquetesService {
    //Consumir el Repository
    @Autowired
    PaquetesRepository repository;

    public Paquetes save( Paquetes entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Paquetes findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Paquetes> findAll(){
        return repository.findAll();
    }
}