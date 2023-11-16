package reserva.core.serviciohabitacion;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reserva.core.gastos.Gastos;
    
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

    @ManyToOne
    private Gastos gastos;
    }
    
