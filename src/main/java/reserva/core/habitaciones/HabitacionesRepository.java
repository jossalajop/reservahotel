package reserva.core.habitaciones;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
    
public interface HabitacionesRepository  extends CrudRepository<Habitaciones,Long>{
    List<Habitaciones> findAll();
        
    }
