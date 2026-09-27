package backend.models;

import backend.enums.TipoUsuario;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Etiqueta que transforma la estructura en una tabla en la BBDD
@Table(name = "usuario") //le das el nombre
@Data // Etiqueta de la libreria LOMBOK que se utiliza para ahorrarte todos los getters y setters (estan puestos aunque tu no los veas)
@NoArgsConstructor //crea un constructor imaginario completamente vacio
@AllArgsConstructor //crea un constructor imaginario con todos los parametros
public class Usuario {
    
    @Id // clave primaria 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // genera valor secuencial
    private Long id;

    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String contrasena;

    @Enumerated(EnumType.STRING) // le indicas a JPA como tiene que guardarlo en la BBDD
    private TipoUsuario tipo; // hace el papel del rol -> "cliente o administrador"
}
