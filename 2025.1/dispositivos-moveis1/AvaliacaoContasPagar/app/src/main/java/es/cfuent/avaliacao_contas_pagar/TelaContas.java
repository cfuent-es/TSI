package es.cfuent.avaliacao_contas_pagar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.LinkedList;

public class TelaContas extends AppCompatActivity {

    TextView edNomeCategoria;
    EditText edDescricaoConta;
    EditText edValorConta;
    EditText edVencimentoConta;

    LinkedList<Conta> listaContas;

    ListView lista;

    ArrayAdapter<Conta> adapter;

    Categoria categoria;

    int posicaoSelecionada = -1;

    class ContaAdapter extends ArrayAdapter<Conta> {
        public ContaAdapter() {
            super(TelaContas.this, R.layout.item_lista_conta, listaContas);
        }

        @Override
        public View getView(int posicao, View view, ViewGroup parent) {
            if (view == null) {
                view = getLayoutInflater().inflate(R.layout.item_lista_conta, null);
            }
            Conta conta = listaContas.get(posicao);
            ((TextView) view.findViewById(R.id.conta_descricao)).setText(conta.getDescricao());
            ((TextView) view.findViewById(R.id.conta_valor)).setText("R$ " + conta.getValor());
            ((TextView) view.findViewById(R.id.conta_data)).setText(conta.getVencimento());
            ((CheckBox) view.findViewById(R.id.conta_paga)).setChecked(conta.isPaga());

            final CheckBox contaPaga = (CheckBox) view.findViewById(R.id.conta_paga);
            contaPaga.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    conta.setPaga(contaPaga.isChecked());
                    categoria.setContas(listaContas);
                    Intent resposta = new Intent();
                    resposta.putExtra("categoria", categoria);
                    setResult(RESULT_OK, resposta);
                }
            });

            CheckBox checkBox = view.findViewById(R.id.item_checkbox);
            checkBox.setChecked(posicao == posicaoSelecionada);

            checkBox.setOnClickListener(v -> {
                if (posicaoSelecionada == posicao) {
                    posicaoSelecionada = -1;
                } else {
                    posicaoSelecionada = posicao;
                }
                notifyDataSetChanged();
            });


            return view;
        }
    }

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

        Toolbar toolbar = findViewById(R.id.toolbar_contas);
        setSupportActionBar(toolbar);

        edNomeCategoria = findViewById(R.id.edNomeCategoria);
        edDescricaoConta = findViewById(R.id.edDescricaoConta);
        edValorConta = findViewById(R.id.edValorConta);
        edVencimentoConta = findViewById(R.id.edVencimentoConta);

        categoria = (Categoria) getIntent().getSerializableExtra("categoria");
        edNomeCategoria.setText(categoria.getNome());
        listaContas = new LinkedList<Conta>();
        listaContas.addAll(categoria.getContas());

        adapter = new ContaAdapter();
        lista = findViewById(R.id.listaContas);
        lista.setAdapter(adapter);
        lista.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                lista.setItemChecked(position, true);
                editarConta(null);
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu_contas, menu);
        return true;
    }

    public void salvarConta(View view) {
        if(posicaoSelecionada < 0) {
            Conta conta = new Conta();
            conta.setDescricao(edDescricaoConta.getText().toString());
            conta.setValor(Double.parseDouble(edValorConta.getText().toString()));
            conta.setVencimento(edVencimentoConta.getText().toString());
            conta.setPaga(false);
            listaContas.add(conta);
        } else {
            Conta conta = listaContas.get(posicaoSelecionada);
            conta.setDescricao(edDescricaoConta.getText().toString());
            conta.setValor(Double.parseDouble(edValorConta.getText().toString()));
            conta.setVencimento(edVencimentoConta.getText().toString());
        }
        posicaoSelecionada = -1;
        edDescricaoConta.setText("");
        edValorConta.setText("");
        edVencimentoConta.setText("");

        //adapter.notifyDataSetChanged();

        categoria.setContas(listaContas);
        Intent resposta = new Intent();
        resposta.putExtra("categoria", categoria);
        setResult(RESULT_OK, resposta);
        adapter.notifyDataSetChanged();
    }

    public void editarConta(View view) {
        posicaoSelecionada = lista.getCheckedItemPosition();

        if (posicaoSelecionada >= 0) {
            Conta conta = listaContas.get(posicaoSelecionada);
            edDescricaoConta.setText(conta.getDescricao());
            edValorConta.setText(String.valueOf(conta.getValor()));
            edVencimentoConta.setText(conta.getVencimento());
        }
    }

    public void voltar(MenuItem item) {
        categoria.setContas(listaContas);
        Intent resposta = new Intent();
        resposta.putExtra("categoria", categoria);
        setResult(RESULT_OK, resposta);
        finish();
    }

    public void remover(MenuItem item) {
        if (posicaoSelecionada != -1) {
            listaContas.remove(posicaoSelecionada);
            posicaoSelecionada = -1;
            adapter.notifyDataSetChanged();
        }
    }

    public void editarMenu(MenuItem item) {
        lista.setItemChecked(posicaoSelecionada, true);
        editarConta(null);
    }

}