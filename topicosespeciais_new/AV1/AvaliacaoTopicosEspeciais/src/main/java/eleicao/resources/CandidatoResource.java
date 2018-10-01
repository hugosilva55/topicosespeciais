package eleicao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eleicao.domain.Candidato;
import eleicao.services.CandidatoService;

@RestController
@RequestMapping(value="/candidatos")
public class CandidatoResource {
	
	@Autowired
	private CandidatoService servico;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Candidato candit1 = servico.BuscarCandidatos(id);
		
		return ResponseEntity.ok().body(candit1);
	}
}
