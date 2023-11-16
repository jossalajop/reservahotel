package reserva.core.transaccion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reserva.core.gastos.Gastos;
import reserva.core.metodopago.Metodopago;
import reserva.core.paquetehabitacion.Paquetehabitacion;
import reserva.core.reservahabitacion.Reservahabitacion;
    
@Data
@Entity
public class Transaccion {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private double costototal;
    private String infopago;

    @ManyToOne
    private Paquetehabitacion paquetehabitacion; 
    private Metodopago metodopago;
    private Reservahabitacion reservahabitacion;
    private Gastos gastos;  
    }
    
