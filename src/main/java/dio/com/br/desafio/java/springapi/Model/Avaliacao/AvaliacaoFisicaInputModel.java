package dio.com.br.desafio.java.springapi.Model.Avaliacao;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class AvaliacaoFisicaInputModel {
    private Aluno aluno;
    private LocalDateTime localDateTime;
    private float peso;
    private float altura;
}

