package br.edu.utfpr.td.tsi.gerenciador.documentos.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Documento;

public class BancoDeDados {
	
	private List<Documento> listaDocumentos = new ArrayList<Documento>();
	
	public void persistir(Documento d) {
		listaDocumentos.add(d);
		System.out.println("gravou no banco de dados: " + d);
		System.out.println(String.format("Total de documentos: %d", listaDocumentos.size()));
	}
	
	public List<Documento> listarDocumentos() {
		return this.listaDocumentos;
	}

}
