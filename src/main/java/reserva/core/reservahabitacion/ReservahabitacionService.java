package reserva.core.reservahabitacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservahabitacionService {
    //Consumir el Repository
    @Autowired
    ReservahabitacionRepository repository;

    public Reservahabitacion save( Reservahabitacion entity){
        return repository.save(entity);
    }
    
    public void deleteById(long id){
        repository.deleteById(id);
    }

    public Reservahabitacion findById(long id){
        return repository.findById(id).orElse(null);
    }

    public List<Reservahabitacion> findAll(){
        return repository.findAll();
    }
}
