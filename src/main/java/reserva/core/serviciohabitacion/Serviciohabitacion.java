package reserva.core.serviciohabitacion;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
    
@Data
@Entity
public class Serviciohabitacion {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String nombreservicio;
    private String descripcion;
    private double precio;
    }
    
