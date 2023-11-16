package reserva.core.reservahabitacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface ReservahabitacionRepository  extends CrudRepository<Reservahabitacion,Long>{
    List<Reservahabitacion> findAll();
        
    }
