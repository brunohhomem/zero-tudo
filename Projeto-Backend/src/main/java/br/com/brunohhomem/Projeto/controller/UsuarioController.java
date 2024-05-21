package br.com.brunohhomem.Projeto.controller;

import br.com.brunohhomem.Projeto.dto.UsuarioDTO;
import br.com.brunohhomem.Projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired private UsuarioService service;

    @GetMapping
    public List<UsuarioDTO> listar(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> buscar(@PathVariable Long id){
        UsuarioDTO dto = service.buscar(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public void inserir(@RequestBody UsuarioDTO dto){
        service.inserir(dto);
    }

    @PutMapping
    public UsuarioDTO alterar(@RequestBody UsuarioDTO dto){
        return service.alterar(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }










}
