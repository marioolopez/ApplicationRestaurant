package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> { // le pasas el usuario con lo que quieres
                                                                          // hacer con el
}