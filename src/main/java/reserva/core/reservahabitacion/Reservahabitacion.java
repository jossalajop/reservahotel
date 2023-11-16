package reserva.core.reservahabitacion;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import reserva.core.habitaciones.Habitaciones;
import reserva.core.usuario.Usuario;
    
@Data
@Entity
public class Reservahabitacion {
        //Atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;
    private Integer numerohabitacion;
    private LocalDate fechaentrada;
    private LocalDate fechasalida;
    private boolean estado;

    @ManyToOne
    private Usuario usuario;
    private Habitaciones habitaciones;
    }
    
