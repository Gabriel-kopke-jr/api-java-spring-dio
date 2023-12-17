package dio.com.br.desafio.java.springapi.Model.Aluno;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class AlunoInputModel {
    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dtNascimento;
    private String bairro;
}
