package reserva.core.categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reserva.core.tipohabitacion.Tipohabitacion;
    
@Data
@Entity
public class Categoria {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private String nombre;

    @ManyToOne
    private Tipohabitacion tipohabitacion;
    }
    
