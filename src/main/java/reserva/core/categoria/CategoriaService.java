package reserva.core.categoria;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    //Consumir el Repository
    @Autowired
    CategoriaRepository repository;

    public Categoria save( Categoria entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Categoria findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Categoria> findAll(){
        return repository.findAll();
    }
}
