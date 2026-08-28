package backend.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import backend.models.Plato;
import backend.service.PlatoService;

@RestController
@RequestMapping("/api/platos")
@CrossOrigin(origins = "http://localhost:4200")
public class PlatoController {

    private final PlatoService platoService;

    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping
    public List<Plato> listarPlatos() {
        return platoService.listarPlatos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plato> obtenerPlato(@PathVariable Long id) {
        return platoService.obtenerPlatoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Plato guardarPlato(@RequestBody Plato plato) {
        return platoService.guardarPlato(plato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPlato(@PathVariable Long id) {
        platoService.eliminarPlato(id);
        return ResponseEntity.noContent().build();
    }

}
