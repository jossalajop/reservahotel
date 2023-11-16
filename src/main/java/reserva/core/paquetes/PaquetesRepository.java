package reserva.core.paquetes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface PaquetesRepository  extends CrudRepository<Paquetes,Long>{
    List<Paquetes> findAll();
        
    }