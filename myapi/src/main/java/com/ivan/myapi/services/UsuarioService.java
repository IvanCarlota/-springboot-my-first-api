package com.ivan.myapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ivan.myapi.domain.Usuario;
import com.ivan.myapi.repositories.UsuarioRepository;

@Component
public class UsuarioService {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario findById(Integer id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElse(null);
	}
	
}
