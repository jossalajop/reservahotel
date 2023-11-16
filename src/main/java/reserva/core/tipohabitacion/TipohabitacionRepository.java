package reserva.core.tipohabitacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface TipohabitacionRepository  extends CrudRepository<Tipohabitacion,Long>{
    List<Tipohabitacion> findAll();
        
    }