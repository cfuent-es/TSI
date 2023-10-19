//package P1.Q3;

public enum Nivel {
	INFANTIL("INFANTIL"),
	FUNDAMENTAL("FUNDAMENTAL"),
	MEDIO("MEDIO");
	
	private String nivel;
	
	Nivel(String nivel)
	{
		this.nivel = nivel;
	}
	
	public String getNivel()
	{
		return nivel;
	}
	
}
