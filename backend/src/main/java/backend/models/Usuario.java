package backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String contrasena;
    private String tipo; // hace el papel del rol -> cliente o administrador
}
