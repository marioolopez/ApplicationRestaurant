package backend.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import backend.models.Plato;
import backend.repository.PlatoRepository;

@Service
public class PlatoService { // creas un método que te devuelva lo que tu creas

    private final PlatoRepository platoRepository;

    public PlatoService(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    public List<Plato> listarPlatos() {
        return platoRepository.findAll();
    }

    public Optional<Plato> obtenerPlatoPorId(Long id) {
        return platoRepository.findById(id);
    }

    public Plato guardarPlato(Plato plato) {
        return platoRepository.save(plato);
    }

    public void eliminarPlatoId(Long id) {
        platoRepository.deleteById(id);
    }

}
