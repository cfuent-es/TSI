package br.edu.utfpr.td.tsi.gerenciador.documentos.controle;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Documento;
import br.edu.utfpr.td.tsi.gerenciador.documentos.persistencia.BancoDeDados;

@Controller
public class DocumentoController {
	BancoDeDados banco = new BancoDeDados();

	@GetMapping(value = "/cadastrarDocumento")
	public String exibirPaginaCadastrarDocumento() {
		return "cadastrarDocumento";
	}

	@PostMapping(value = "/cadastrarDocumento")
	public String cadastrarDocumento(Documento documento) {
		banco.persistir(documento);
		return "index";
	}

	@GetMapping(value = "/listarDocumentos")
	public String exibirPaginaListarDocumentos(Model model) {
		
		List<Documento> documentos = banco.listarDocumentos();
		model.addAttribute("documentos", documentos);
		System.out.println(documentos);

		return "listarDocumentos";
	}

	@GetMapping(value = "/removerDocumento")
	public String removerDocumentos(@RequestParam String idDocumento) {

		return "index";
	}

}
