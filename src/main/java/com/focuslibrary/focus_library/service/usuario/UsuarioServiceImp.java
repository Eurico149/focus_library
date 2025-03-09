package com.focuslibrary.focus_library.service.usuario;

import com.focuslibrary.focus_library.dto.UsuarioPostPutRequestDTO;
import com.focuslibrary.focus_library.dto.UsuarioResponseDTO;
import com.focuslibrary.focus_library.model.Usuario;
import com.focuslibrary.focus_library.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsers() {
        return usuarioRepository.findAll();
    }

    public UsuarioResponseDTO addUsuario(UsuarioPostPutRequestDTO usuarioDTO) {
        Usuario usuario = Usuario.builder().nome(usuarioDTO.getNome()).senha(usuarioDTO.getSenha()).build();
        usuarioRepository.save(usuario);
        return UsuarioResponseDTO.builder().id(usuario.getId()).nome(usuario.getNome()).build();
    }
}
