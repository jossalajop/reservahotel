package reserva.core.metodopago;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetodopagoService {
    //Consumir el Repository
    @Autowired
    MetodopagoRepository repository;

    public Metodopago save( Metodopago entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Metodopago findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Metodopago> findAll(){
        return repository.findAll();
    }
}
