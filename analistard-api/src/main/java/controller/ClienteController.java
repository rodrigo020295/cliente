package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.analistard.model.Cliente;
import com.analistard.repository.ClienteRepository;

import antlr.collections.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List listar() {
		return (List) clienteRepository.findAll();
		
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
	    return clienteRepository.save(cliente);
	
	
	
	}
	
	
}
