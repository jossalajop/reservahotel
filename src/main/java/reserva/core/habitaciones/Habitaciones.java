package reserva.core.habitaciones;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reserva.core.tipohabitacion.Tipohabitacion;
    
@Data
@Entity
public class Habitaciones {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private Integer numerohabitaciones;
    private boolean estado;

    @ManyToOne
    private Tipohabitacion tipohabitacion;
    }
    