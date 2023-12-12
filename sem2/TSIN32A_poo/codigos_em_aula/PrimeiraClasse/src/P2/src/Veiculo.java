import java.math.BigDecimal;
import java.time.LocalDate;

public class Veiculo {
    private String placa;
    private String cor;
    private String modelo;
    private String fabricante;
    private int anoFabricacao;
    private BigDecimal valorVeiculo;
    private LocalDate vencimentoIpva;

    public Veiculo(String placa, String cor, String modelo, String fabricante, int anoFabricacao, BigDecimal valorVeiculo, LocalDate vencimentoIpva) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.valorVeiculo = valorVeiculo;
        this.vencimentoIpva = vencimentoIpva;
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public BigDecimal getValorVeiculo() {
        return this.valorVeiculo;
    }

    public LocalDate getVencimentoIpva() {
        return this.vencimentoIpva;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setValorVeiculo(BigDecimal valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    public void setVencimentoIpva(LocalDate vencimentoIpva) {
        this.vencimentoIpva = vencimentoIpva;
    }


}
