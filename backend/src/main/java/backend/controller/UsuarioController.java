package backend.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios") //ruta que defines para este fichero
@CrossOrigin(origins = "http://localhost:4200") //le das permiso a angular para hablar con spring boot (para consumir los endpoints, es IMPORTANTISIMO)
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    //OBTENER TODOS LOS USUARIOS
    @GetMapping 
    public ResponseEntity> listarUsuarios() { // <-- Añadido >
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }
}
