package br.com.brunohhomem.Projeto.service;

import br.com.brunohhomem.Projeto.dto.UsuarioDTO;
import br.com.brunohhomem.Projeto.entity.UsuarioEntity;
import br.com.brunohhomem.Projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired private UsuarioRepository repository;

    public List<UsuarioDTO> listarTodos(){
        List<UsuarioEntity> usuarios = repository.findAll();
        return usuarios.stream().map(UsuarioDTO::new).toList();
    }

    public UsuarioDTO buscar(Long id){
        return new UsuarioDTO(repository.findById(id).get());
    }

    public void inserir(UsuarioDTO dto){
        UsuarioEntity entity = new UsuarioEntity(dto);
        repository.save(entity);
    }

    public UsuarioDTO alterar(UsuarioDTO dto){
        UsuarioEntity entity = new UsuarioEntity(dto);
        return new UsuarioDTO(repository.save(entity));
    }

    public void excluir(Long id){
        UsuarioEntity entity = repository.findById(id).get();
        repository.delete(entity);
    }
}
