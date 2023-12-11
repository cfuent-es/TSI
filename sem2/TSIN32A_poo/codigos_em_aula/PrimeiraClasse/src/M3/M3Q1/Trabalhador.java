package M3.M3Q1;

import java.math.BigDecimal;

public class Trabalhador {
	private String nome;
	private BigDecimal salario;
	private Cargo cargo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
    @Override
    public String toString(){
        return "Trabalhador [nome=" +
                nome +
                ", salario=" + 
                salario.setScale(2) + 
                ", cargo=" + 
                cargo.getDescricao() + 
                ", trabalha no maximo " + 
                cargo.getCargaHoraria() + 
                " horas]";
    }
	
}
