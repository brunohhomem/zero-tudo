package br.com.brunohhomem.Projeto.dto;

import br.com.brunohhomem.Projeto.entity.UsuarioEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String email;

    public UsuarioDTO(UsuarioEntity usuario){
        BeanUtils.copyProperties(usuario, this);
    }
}
