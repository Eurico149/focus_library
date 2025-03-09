package com.focuslibrary.focus_library.service.usuario;
import com.focuslibrary.focus_library.dto.UsuarioPostPutRequestDTO;
import com.focuslibrary.focus_library.dto.UsuarioResponseDTO;
import com.focuslibrary.focus_library.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> listarUsers();

    UsuarioResponseDTO addUsuario(UsuarioPostPutRequestDTO usuarioDTO);
}
