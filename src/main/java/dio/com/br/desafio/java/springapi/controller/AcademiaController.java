package dio.com.br.desafio.java.springapi.controller;

import dio.com.br.desafio.java.springapi.Model.Aluno.Aluno;
import dio.com.br.desafio.java.springapi.Model.Aluno.AlunoInputModel;
import dio.com.br.desafio.java.springapi.Model.Aluno.AlunoOutputModel;
import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisica;
import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisicaInputModel;
import dio.com.br.desafio.java.springapi.Model.Avaliacao.AvaliacaoFisicaOutputModel;
import dio.com.br.desafio.java.springapi.Service.AcademiaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Api(value = "Academia")
@RequestMapping("/academia")
public class AcademiaController {
    @Autowired
    private AcademiaService academiaService;

    @ApiOperation("Busca aluno por id")
    @GetMapping("/aluno/{id}")
    public Optional<AlunoOutputModel> buscarAlunoPorId(@PathVariable Integer id){
        return academiaService.buscarAlunoPorId(id);
    }

    @ApiOperation("Insere um aluno")
    @PostMapping("/aluno")
    public void cadastrarAluno(@RequestBody AlunoInputModel aluno){
         academiaService.cadastrarAluno(aluno);
    }
    @ApiOperation("Atualiza um aluno")
    @PutMapping("/aluno")
    public void atualizarAluno(@RequestBody AlunoInputModel aluno){
        academiaService.cadastrarAluno(aluno);
    }
    @ApiOperation("Deleta um aluno")
    @DeleteMapping("aluno/{id}")
    public void deletarAlunoPorId(@PathVariable Integer id){
        academiaService.deletarAluno(id);
    }

    @ApiOperation("Busca avaliacaoFisica por id")
    @GetMapping("/avaliacaoFisica/{id}")
    public Optional<AvaliacaoFisicaOutputModel> buscaAvaliacaoPorId(@PathVariable Integer id){
        return academiaService.buscarAvaliacaoFisicaPorId(id);
    }

    @ApiOperation("Busca avaliacaoFisica por id")
    @PostMapping("/avaliacaoFisica/")
    public void cadastrarAvaliacaoFisica(@RequestBody AvaliacaoFisicaInputModel avaliacaoFisicaInputModel){
         academiaService.cadastraAvaliacaoFisica(avaliacaoFisicaInputModel);
    }

    @ApiOperation("Delete avaliacao-fisica por id")
    @DeleteMapping("/avaliacaoFisica/{id}")
    public void deletarAvalicaoFisica(@PathVariable Integer id){
    academiaService.deletarAvalicaoFisica(id);
    }





}


