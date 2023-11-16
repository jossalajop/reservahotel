package reserva.core.serviciohabitacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface ServiciohabitacionRepository  extends CrudRepository<Serviciohabitacion,Long>{
    List<Serviciohabitacion> findAll();
        
    }
