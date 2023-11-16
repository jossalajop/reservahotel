package reserva.core.gastos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastosService {
    //Consumir el Repository
    @Autowired
    GastosRepository repository;

    public Gastos save( Gastos entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Gastos findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Gastos> findAll(){
        return repository.findAll();
    }
}
