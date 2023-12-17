package dio.com.br.desafio.java.springapi.Model.Aluno;

import dio.com.br.desafio.java.springapi.Model.Matricula.Matricula;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class AlunoOutputModel {
    private String nome;
    private Integer numeroMatricula;
}
