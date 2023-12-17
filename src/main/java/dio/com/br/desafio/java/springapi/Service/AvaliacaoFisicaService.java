package dio.com.br.desafio.java.springapi.Service;

import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisica;
import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisicaInputModel;
import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisicaOutputModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Service
public class AvaliacaoFisicaService {

    public AvaliacaoFisica avaliacaoFisicaInputModelMapper(AvaliacaoFisicaInputModel avaliacaoFisicaInputModel){
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        avaliacaoFisica.setAluno(avaliacaoFisicaInputModel.getAluno());
        avaliacaoFisica.setDtAvaliacao(LocalDate.now());
        return avaliacaoFisica;
    }

    public Optional<AvaliacaoFisicaOutputModel>  avaliacaoFisicaOutPutModelMapper(Optional<AvaliacaoFisica> avaliacaoFisica){
        AvaliacaoFisicaOutputModel avaliacaoFisicaOutputModel = AvaliacaoFisicaOutputModel.builder().
                aluno(avaliacaoFisica.get().getAluno()).
                dtAvaliacao(avaliacaoFisica.get().getDtAvaliacao()).build();
        return Optional.ofNullable(avaliacaoFisicaOutputModel);
    }
}
