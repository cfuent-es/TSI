package es.cfuent.avaliacao_contas_pagar;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaContas extends AppCompatActivity {

    TextView edNomeCategoria;
    EditText edDescricaoConta;
    EditText edValorConta;
    EditText edVencimentoConta;

    ListView listaContas;

    Categoria categoria;

    int posicaoSelecionada = -1;

    public TelaContas(){
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_contas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edNomeCategoria = findViewById(R.id.edNomeCategoria);
        edDescricaoConta = findViewById(R.id.edDescricaoConta);
        edValorConta = findViewById(R.id.edValorConta);
        edVencimentoConta = findViewById(R.id.edVencimentoConta);
        listaContas = findViewById(R.id.listaContas);

        categoria = (Categoria) getIntent().getSerializableExtra("categoria");
        edNomeCategoria.setText(categoria.getNome());
    }

    public void salvarConta(View view) {
            Conta conta = new Conta();
            conta.setDescricao(edNomeCategoria.getText().toString());
            conta.setValor(Double.parseDouble(edValorConta.getText().toString()));
            conta.setVencimento(edVencimentoConta.getText().toString());
            categoria.addConta(conta);
    }
}