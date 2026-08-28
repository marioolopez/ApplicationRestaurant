package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.models.Plato;

public interface PlatoRepository extends JpaRepository<Plato, Long> { // le pasas el id y la clase
}
