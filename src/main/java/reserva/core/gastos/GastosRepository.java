package reserva.core.gastos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface GastosRepository  extends CrudRepository<Gastos,Long>{
    List<Gastos> findAll();
        
    }
