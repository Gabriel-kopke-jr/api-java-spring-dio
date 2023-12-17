package dio.com.br.desafio.java.springapi.Repository;

import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica,Integer> {
}
