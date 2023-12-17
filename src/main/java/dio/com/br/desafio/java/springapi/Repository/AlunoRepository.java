package dio.com.br.desafio.java.springapi.Repository;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import dio.com.br.desafio.java.springapi.Model.Aluno.AlunoOutputModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlunoRepository extends  JpaRepository<Aluno, Integer>{

}
