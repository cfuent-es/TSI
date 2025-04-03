package br.edu.utfpr.td.tsi.gerenciador.documentos.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Documento;

@Controller
public class DocumentoController {

	@GetMapping(value = "/cadastrarDocumento")
	public String exibirPaginaCadastrarDocumento() {
		return "cadastrarDocumento";
	}

	@PostMapping(value = "/cadastrarDocumento")
	public String cadastrarDocumento(Documento documento) {

		return "index";
	}

	@GetMapping(value = "/listarDocumentos")
	public String exibirPaginaListarDocumentos(Model model) {

		return "listarDocumentos";
	}

	@GetMapping(value = "/removerDocumento")
	public String removerDocumentos(@RequestParam String idDocumento) {

		return "index";
	}

}
