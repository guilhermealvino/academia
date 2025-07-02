package br.com.academias.academia.application;

import br.com.academias.academia.domain.Aluno;
import br.com.academias.academia.domain.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarAlunoUseCase {

    private final AlunoRepository alunoRepository;

    public BuscarAlunoUseCase(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Optional<Aluno> executar(Long id) {
        return alunoRepository.findById(id);
    }
}
