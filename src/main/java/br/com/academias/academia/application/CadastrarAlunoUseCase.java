package br.com.academias.academia.application;

import org.springframework.stereotype.Service;

import br.com.academias.academia.domain.Aluno;
import br.com.academias.academia.domain.AlunoRepository;

@Service
public class CadastrarAlunoUseCase {

    private final AlunoRepository alunoRepository;

    public CadastrarAlunoUseCase(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno executar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
