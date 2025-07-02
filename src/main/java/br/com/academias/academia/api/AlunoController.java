package br.com.academias.academia.api;

import br.com.academias.academia.application.BuscarAlunoUseCase;
import br.com.academias.academia.application.CadastrarAlunoUseCase;
import br.com.academias.academia.domain.Aluno;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final CadastrarAlunoUseCase cadastrarAlunoUseCase;
    private final BuscarAlunoUseCase buscarAlunoUseCase;

    public AlunoController(CadastrarAlunoUseCase cadastrarAlunoUseCase, BuscarAlunoUseCase buscarAlunoUseCase) {
        this.cadastrarAlunoUseCase = cadastrarAlunoUseCase;
        this.buscarAlunoUseCase = buscarAlunoUseCase;
    }

    @PostMapping
    public ResponseEntity<Aluno> cadastrar(@RequestBody Aluno aluno) {
        Aluno salvo = cadastrarAlunoUseCase.executar(aluno);
        return new ResponseEntity<>(salvo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarPorId(@PathVariable Long id) {
        return buscarAlunoUseCase.executar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}