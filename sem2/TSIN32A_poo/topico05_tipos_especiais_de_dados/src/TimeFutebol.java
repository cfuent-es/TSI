package tiposEspeciais.exemplos.aula;

public enum TimeFutebol {
	PALMEIRAS("São Paulo"),
	AMERICA("Belo Horizonte"),
	UNIAO("Francisco Beltrão");
	
	private String cidade;
	
	TimeFutebol(String cidade){
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
}

