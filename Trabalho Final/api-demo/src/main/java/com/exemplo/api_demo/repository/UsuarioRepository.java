package com.exemplo.api_demo.repository;

import com.exemplo.api_demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface que o Spring usa pra gerar as operações no banco
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}