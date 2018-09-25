package eleicao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eleicao.domain.Candidato;
import eleicao.repositories.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository repos;

	public Candidato BuscarCandidatos(Integer id) {
		Optional<Candidato> cand1 = repos.findById(id);

		return cand1.orElse(null);
	}
}
