package reserva.core.metodopago;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface MetodopagoRepository  extends CrudRepository<Metodopago,Long>{
    List<Metodopago> findAll();
        
    }