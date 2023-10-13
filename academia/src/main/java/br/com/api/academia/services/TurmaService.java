package br.com.api.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.academia.entities.Turma;
import br.com.api.academia.repositories.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	TurmaRepository turmaRepo;
	
	public List<Turma> listarTurmaes() {
		return turmaRepo.findAll();
	}

	public Turma buscarTurmaPorId(Integer id) {
		return turmaRepo.findById(id).orElse(null);
	}

	public Turma salvarTurma(Turma turma) {
		return turmaRepo.save(turma);
	}
	
	public Turma atualizarTurma(Turma turma) {
		return turmaRepo.save(turma);
	}

			public Boolean deletarTurma(Turma turma) {
			if(turma == null)
			return false;
				
				Turma turmaExistente = buscarTurmaPorId(turma.getIdTurma());
			if(turmaExistente == null)
				return false;
				
					turmaRepo.delete(turma);
		
					Turma turmaContinuaExistindo = buscarTurmaPorId(turma.getIdTurma());
					
					if(turmaContinuaExistindo == null)
		return true;
					return false;
		}


}
