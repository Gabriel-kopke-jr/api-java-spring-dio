package dio.com.br.desafio.java.springapi.Model.Avaliacao;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import dio.com.br.desafio.java.springapi.Model.Matricula.Matricula;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class AvaliacaoFisicaOutputModel {
    private Aluno aluno;
    private LocalDate dtAvaliacao;
    private Matricula matricula;
}
