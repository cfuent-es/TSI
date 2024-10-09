import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class AnalisadorDados {
    private List<Veiculo> veiculos;
    private LocalDate dataReferencia;

    public Relatorio analisar(List<Veiculo> veiculos, LocalDate dataReferencia) {

        int totalVeiculosVencidos = 0;
        BigDecimal totalValorVeiculosVencidos = BigDecimal.ZERO;
        BigDecimal aliquotaImposto = BigDecimal.valueOf(9.75);
        BigDecimal totalImposto = BigDecimal.ZERO;

        for(Veiculo veiculo : veiculos) {
            if(veiculo.getVencimentoIpva().isBefore(dataReferencia)) {
                totalVeiculosVencidos++;
                totalValorVeiculosVencidos = totalValorVeiculosVencidos.add(veiculo.getValorVeiculo());
                totalImposto = totalImposto.add(veiculo.getValorVeiculo().multiply(aliquotaImposto).divide(BigDecimal.valueOf(100)));
            }
        }

    }
}
