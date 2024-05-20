package br.com.brunohhomem.Projeto.entity;

import br.com.brunohhomem.Projeto.dto.UsuarioDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@Entity
@Table(name = "usuario")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false, unique = true)
    private String email;

    public UsuarioEntity(UsuarioDTO dto){
        BeanUtils.copyProperties(dto, this);
    }
}
