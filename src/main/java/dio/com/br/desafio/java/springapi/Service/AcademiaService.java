package dio.com.br.desafio.java.springapi.Service;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import dio.com.br.desafio.java.springapi.Model.Aluno.AlunoInputModel;
import dio.com.br.desafio.java.springapi.Model.Aluno.AlunoOutputModel;
import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisica;
import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisicaInputModel;
import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisicaOutputModel;
import dio.com.br.desafio.java.springapi.Model.Matricula.Matricula;
import dio.com.br.desafio.java.springapi.Repository.AlunoRepository;
import dio.com.br.desafio.java.springapi.Repository.AvaliacaoFisicaRepository;
import dio.com.br.desafio.java.springapi.Repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AcademiaService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoService alunoService;

    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;

    @Autowired
    private MatriculaService matriculaService;

    public Optional<AlunoOutputModel> buscarAlunoPorId(Integer id){
         Optional<Aluno> aluno =  alunoRepository.findById(id);
         Optional<Matricula> matricula = Optional.ofNullable(matriculaRepository.findByAlunoId(id));
         Optional<AlunoOutputModel> alunoOutputModel =  alunoService.alunoOutPutModelMapper(aluno,matricula);
        return alunoOutputModel;
    }

    public void cadastrarAluno(AlunoInputModel alunoInputModel){
        Aluno aluno =  alunoService.alunoInputModelMapper(alunoInputModel);
        Matricula matricula = matriculaService.cadastrarMatricula(aluno);
        alunoRepository.save(aluno);
        matriculaRepository.save(matricula);
    }

    public void deletarAluno(Integer id){
        alunoRepository.deleteById(id);
    }

    public void cadastraAvaliacaoFisica(AvaliacaoFisicaInputModel avaliacaoFisicaInputModel){
        AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaService.avaliacaoFisicaInputModelMapper(avaliacaoFisicaInputModel);
        avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    public void deletarAvalicaoFisica(Integer id){
        avaliacaoFisicaRepository.deleteById(id);
    }

    public Optional<AvaliacaoFisicaOutputModel> buscarAvaliacaoFisicaPorId(Integer id){
        Optional<AvaliacaoFisica>  avaliacaoFisica =  avaliacaoFisicaRepository.findById(id);
        Optional<AvaliacaoFisicaOutputModel> avaliacaoFisicaOutputModel =  avaliacaoFisicaService.avaliacaoFisicaOutPutModelMapper(avaliacaoFisica);
        return avaliacaoFisicaOutputModel;

    }




}
