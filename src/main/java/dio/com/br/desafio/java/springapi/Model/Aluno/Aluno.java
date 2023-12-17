package dio.com.br.desafio.java.springapi.Model.Aluno;

import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisica;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String sobrenome;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;
    @OneToMany
    @JoinColumn(name = "avaliacaofisica_id")
    private List<AvaliacaoFisica> avaliacaoFisica;



}