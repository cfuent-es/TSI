package tiposEspeciais.exemplos.aula;

public class Exemplo11 {
	public static void main(String[] args) {
		Torcedor t = new Torcedor();
		t.setNome("Ana");
		t.setTorcePara(TimeFutebol.UNIAO);
		
		String resposta = String.format("%s torce para um time da cidade de %s", t.getNome(), t.getTorcePara().getCidade());
		System.out.println(resposta);
	}
}
