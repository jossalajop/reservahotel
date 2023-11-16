package reserva.core.paquetehabitacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface PaquetehabitacionRepository  extends CrudRepository<Paquetehabitacion,Long>{
    List<Paquetehabitacion> findAll();
        
    }
