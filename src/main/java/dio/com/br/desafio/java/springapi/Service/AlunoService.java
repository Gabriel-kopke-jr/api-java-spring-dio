package dio.com.br.desafio.java.springapi.Service;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import dio.com.br.desafio.java.springapi.Model.Aluno.AlunoInputModel;
import dio.com.br.desafio.java.springapi.Model.Aluno.AlunoOutputModel;
import dio.com.br.desafio.java.springapi.Model.Matricula.Matricula;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunoService {

    public Aluno alunoInputModelMapper(AlunoInputModel alunoInputModel){
       Aluno aluno = new Aluno();
       aluno.setCpf(alunoInputModel.getCpf());
       aluno.setBairro(alunoInputModel.getBairro());
       aluno.setNome(alunoInputModel.getNome());
       aluno.setSobrenome(alunoInputModel.getSobrenome());
       aluno.setDataDeNascimento(alunoInputModel.getDtNascimento());
       return aluno;
    }

    public Optional<AlunoOutputModel> alunoOutPutModelMapper(Optional<Aluno> aluno, Optional<Matricula> matricula){
        AlunoOutputModel alunoOutputModel = AlunoOutputModel
                .builder()
                .nome(aluno.get().getNome())
                .numeroMatricula(matricula.get().getId())
                .build();
        return Optional.ofNullable(alunoOutputModel);
    }
}
