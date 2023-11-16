package reserva.core.paquetehabitacion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reserva.core.paquetes.Paquetes;
    
@Data
@Entity
public class Paquetehabitacion {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String observacion;

    @ManyToOne
    private Paquetes paquetes;
    }
    
