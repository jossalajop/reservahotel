package reserva.core.tipohabitacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipohabitacionService {
    //Consumir el Repository
    @Autowired
    TipohabitacionRepository repository;

    public Tipohabitacion save( Tipohabitacion entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Tipohabitacion findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Tipohabitacion> findAll(){
        return repository.findAll();
    }
}
