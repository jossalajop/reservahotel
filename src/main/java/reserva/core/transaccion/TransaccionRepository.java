package reserva.core.transaccion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface TransaccionRepository  extends CrudRepository<Transaccion,Long>{
    List<Transaccion> findAll();
        
    }