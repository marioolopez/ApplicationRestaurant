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

    // Listar todos los platos
    @GetMapping
    public ResponseEntity<List<Plato>> listarPlatos() {
        return ResponseEntity.ok(platoService.listarPlatos());
    }

    // Listar los platos por ID
    @GetMapping("/{id}")
    public ResponseEntity<Plato> obtenerPlato(@PathVariable Long id) {
        return platoService.obtenerPlatoPorId(id)
                .map(ResponseEntity::ok) // si todo va bien te devuelve el plato
                .orElse(ResponseEntity.notFound().build()); // si no va bien pues te devuelve un 404
    }

    // Guardar el plato
    @PostMapping
    public Plato guardarPlato(@RequestBody Plato plato) {
        return platoService.guardarPlato(plato);
    }

    // Eliminar el plato por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPlatoId(@PathVariable Long id) {
        platoService.eliminarPlatoId(id);
        return ResponseEntity.noContent().build();
    }

}
// RECUERDA:
/* RESPONSEENTITY ES UNA HERRAMIENTA PARA VALIDAR EL ESTADO DE
LAS RESPUESTAS */