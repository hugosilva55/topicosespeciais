package eleicao.resources;

import org.springframework.beans.factory.annotation.Autowired;


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
