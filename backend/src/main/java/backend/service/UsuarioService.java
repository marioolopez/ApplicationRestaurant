package backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import backend.models.Usuario;
import backend.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) { // para la inyeccion de dependencias
        this.usuarioRepository = usuarioRepository;
    }

    // preguntate, ¿que harás con el usuario?

    // crear un usuario nuevo
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // listar todos los usuarios
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // buscar un usuario por su ID
    public Optional<Usuario> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // modificar por ID ese usuario
    public Usuario actualizarUsuario(Long id, Usuario usuarioDetalles) {
        return usuarioRepository.findById(id)
                .map(usuarioExistente -> {
                    // actualizas los campos con la información que viene del frontend
                    usuarioExistente.setNombre(usuarioDetalles.getNombre());
                    usuarioExistente.setEmail(usuarioDetalles.getEmail());
                    // si tienes más campos en Usuario (como password), los actualizas aquí

                    // save() detecta que ya tiene ID y hace un UPDATE en la BBDD
                    return usuarioRepository.save(usuarioExistente);
                })
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }

    // eliminar el usuario por ID
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

}
