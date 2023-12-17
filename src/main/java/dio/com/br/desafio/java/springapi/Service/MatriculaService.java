package dio.com.br.desafio.java.springapi.Service;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import dio.com.br.desafio.java.springapi.Model.Aluno.AlunoInputModel;
import dio.com.br.desafio.java.springapi.Model.Matricula.Matricula;
import dio.com.br.desafio.java.springapi.Repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    public Matricula cadastrarMatricula(Aluno aluno){
        Matricula matricula = new Matricula();
        matricula.setAluno(aluno);
        matricula.setDataDaMatricula(LocalDateTime.now());
        return matricula;
            }
}
