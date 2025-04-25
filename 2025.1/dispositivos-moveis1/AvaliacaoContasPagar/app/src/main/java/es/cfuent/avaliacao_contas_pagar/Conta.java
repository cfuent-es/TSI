package es.cfuent.avaliacao_contas_pagar;

import java.io.Serializable;
import java.util.Date;

public class Conta implements Serializable {

    private String nome;
    private Date vencimento;
    private double valor;
    private Categoria categoria;

}
