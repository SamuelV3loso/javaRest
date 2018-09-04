package ifal.edu.pw2.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifal.edu.pw2.demo.modelo.Atendimento;
import ifal.edu.pw2.demo.modelo.Medico;
import ifal.edu.pw2.demo.repositorios.AtendimentoRepository;
import ifal.edu.pw2.demo.repositorios.MedicoRepository;
import ifal.edu.pw2.demo.repositorios.PacienteRepository;

@RestController
@RequestMapping("api/load")
public class BuildResource {

	@Autowired
	MedicoRepository medicoRepository;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@Autowired
	AtendimentoRepository atendimentoRepository;
	
	
	@GetMapping
	public void build() {
		Atendimento a = new Atendimento();
		atendimentoRepository.save(a);
	}
}
