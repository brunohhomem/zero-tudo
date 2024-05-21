package br.com.brunohhomem.Projeto.repository;

import br.com.brunohhomem.Projeto.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
