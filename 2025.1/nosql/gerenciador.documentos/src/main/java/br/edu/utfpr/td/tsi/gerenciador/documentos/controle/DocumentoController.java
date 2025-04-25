package br.edu.utfpr.td.tsi.gerenciador.documentos.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Documento;
import br.edu.utfpr.td.tsi.gerenciador.documentos.persistencia.DocumentoDAO;

@Controller
public class DocumentoController {

	@Autowired
	private DocumentoDAO documentoDAO;

	@GetMapping(value = "/cadastrarDocumento")
	public String exibirPaginaCadastrarDocumento() {
		return "cadastrarDocumento";
	}

	@PostMapping(value = "/cadastrarDocumento")
	public String cadastrarDocumento(Documento documento) {
		documentoDAO.cadastrar(documento);
		return "index";
	}

	@GetMapping(value = "/listarDocumentos")
	public String exibirPaginaListarDocumentos(Model model) {
		List<Documento> documentos = documentoDAO.listarTodos();
		model.addAttribute("documentos", documentos);
		return "listarDocumentos";
	}

	@GetMapping(value = "/removerDocumento")
	public String removerDocumentos(@RequestParam String idDocumento) {
		System.out.println("removendo documento de id " + idDocumento);
		documentoDAO.remover(idDocumento);
		return "index";
	}

}
