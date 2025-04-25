package br.edu.utfpr.td.tsi.gerenciador.documentos.controle;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Autor;
import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Documento;
import br.edu.utfpr.td.tsi.gerenciador.documentos.persistencia.BancoDeDados;

@Controller
public class AutorController {
	BancoDeDados banco = new BancoDeDados();
	
	@GetMapping(value = "/cadastrarAutor")
	public String exibirPaginaCadastrarAutor() {
		return "cadastrarAutor";
	}
	
	@PostMapping(value = "/cadastrarAutor")
	public String cadastrarAutor(Autor autor) {
		banco.persistir(autor);
		return "index";
	}

}
