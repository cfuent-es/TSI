package M3.M3Q1;

public enum Cargo {
	MED("medico", 8),
	TRAD("tecnico em radiologia", 4),
	PA("piloto de aviao", 5),
	DEV("programador de sistemas", 8);
	
    private String descricao;
	private int cargaHoraria;
	
	Cargo(String descricao, int carga_horaria){
        this.descricao = descricao;
		this.cargaHoraria = carga_horaria;
	}

    public String getDescricao(){
        return descricao;
    }
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
}
