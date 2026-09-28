package backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "plato")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private Double precio;
    private String descripcion;
    private String imagen_url;

    private boolean disponible; // Si el plato esta disponible en la cocina

    //RELACION CON CATEGORIA
    @ManyToOne 
    @JoinColumn(name = "categoria_id") // Nombre de la columna clave foránea en la BBDD
    public Categoria categoria; // Dices que vas a llamar a id_categoria de la tabla categorias para ponerlo de clave foránea en la tabla PLATOS 

}
