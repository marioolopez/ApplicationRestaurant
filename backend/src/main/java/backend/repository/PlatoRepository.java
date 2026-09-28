package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.models.Plato;

public interface PlatoRepository extends JpaRepository<Plato, Long> { // le pasas el id y la clase
}

// <Plato, Long>
// Plato --> es la primera entidad con la que va a trabajar el repositorio
// Long --> Indicas la clave primaria a la hora de eliminar por ID o modificaciones por ID