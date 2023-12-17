package dio.com.br.desafio.java.springapi.Repository;

import dio.com.br.desafio.java.springapi.Model.Matricula.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Integer> {

    Matricula findByAlunoId(Integer alunoId);
}
