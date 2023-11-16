package reserva.core.paquetes;

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
public class Paquetes {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String email;
    private String nombrepaquete;
    private BigDecimal costopaquete;
    private Integer tiempoestadia;
    private String descripcion;

    @ManyToOne
    private Reservahabitacion reservahabitacion;
    }
    
