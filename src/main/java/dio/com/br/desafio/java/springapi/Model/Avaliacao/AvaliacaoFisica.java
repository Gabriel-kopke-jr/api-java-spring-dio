package dio.com.br.desafio.java.springapi.Model.Avaliacao;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    private Aluno aluno;
    private LocalDate dtAvaliacao;

}
