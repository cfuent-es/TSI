package br.edu.utfpr.td.tsi.gerenciador.documentos.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Autor;
import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Documento;

public class BancoDeDados {
	
	private List<Documento> listaDocumentos = new ArrayList<Documento>();
	private List<Autor> listaAutores = new ArrayList<Autor>();
	
	public void persistir(Documento d) {
		listaDocumentos.add(d);
		System.out.println("gravou no banco de dados: " + d);
		System.out.println(String.format("Total de documentos: %d", listaDocumentos.size()));
	}
	
	public void persistir(Autor a) {
		listaAutores.add(a);
		System.out.println("gravou no banco de dados: " + a);
		System.out.println(String.format("Total de autores: %d", listaAutores.size()));
	}
	
	public List<Documento> listarDocumentos() {
		return this.listaDocumentos;
	}
	
	public List<Autor> listarAutores() {
		return this.listaAutores;
	}

}
