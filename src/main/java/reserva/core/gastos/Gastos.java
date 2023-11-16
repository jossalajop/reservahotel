package reserva.core.gastos;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reserva.core.reservahabitacion.Reservahabitacion;
    
@Data
@Entity
public class Gastos {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private Integer cantidad;
    private BigDecimal precio;
    
    @ManyToOne
    private Reservahabitacion reservahabitacion;
    }
    
