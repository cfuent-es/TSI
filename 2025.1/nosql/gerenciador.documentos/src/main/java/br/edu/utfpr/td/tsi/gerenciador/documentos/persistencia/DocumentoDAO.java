package br.edu.utfpr.td.tsi.gerenciador.documentos.persistencia;

import java.util.List;

import br.edu.utfpr.td.tsi.gerenciador.documentos.modelo.Documento;

public interface DocumentoDAO {

	public void cadastrar(Documento d);
	
	public List<Documento> listarTodos();
	
	public void remover(String id);
	
}
