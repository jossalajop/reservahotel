package reserva.core.transaccion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransaccionService {
    //Consumir el Repository
    @Autowired
    TransaccionRepository repository;

    public Transaccion save( Transaccion entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Transaccion findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Transaccion> findAll(){
        return repository.findAll();
    }
}