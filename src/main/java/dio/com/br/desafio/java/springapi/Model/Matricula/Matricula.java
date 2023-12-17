package dio.com.br.desafio.java.springapi.Model.Matricula;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Matricula {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    private LocalDateTime dataDaMatricula;


}
