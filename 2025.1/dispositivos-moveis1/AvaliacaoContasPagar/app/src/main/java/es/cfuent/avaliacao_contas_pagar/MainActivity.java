package es.cfuent.avaliacao_contas_pagar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.widget.Toolbar;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    EditText edNomeCategoria;
    LinkedList<Categoria> listaCategorias;
    ArrayAdapter<Categoria> adapter;
    ListView lista;

    int posicaoSelecionada = -1;

    ActivityResultLauncher<Intent> editor;

    class CategoriaAdapter extends ArrayAdapter<Categoria> {
        public CategoriaAdapter(){ super(MainActivity.this, R.layout.item_lista_categoria, listaCategorias); }

        @Override
        public View getView(int posicao, View view, ViewGroup parent){
            if(view == null){
                view = getLayoutInflater().inflate(R.layout.item_lista_categoria, null);
            }
            Categoria cat = listaCategorias.get(posicao);
            ((TextView) view.findViewById(R.id.item_nome_categoria)).setText(cat.getNome());
            ((TextView) view.findViewById(R.id.item_total_value)).setText(String.format("R$ %.2f", cat.getTotal()));
            ((TextView) view.findViewById(R.id.item_pago_value)).setText(String.format("R$ %.2f", cat.getPago()));
            ((TextView) view.findViewById(R.id.item_apagar_value)).setText(String.format("R$ %.2f", cat.getApagar()));
            ((TextView) view.findViewById(R.id.item_total_contas)).setText(String.valueOf(cat.getContas().size()));

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edNomeCategoria = findViewById(R.id.edNomeCategoria);
        listaCategorias = new LinkedList<>();

        if (savedInstanceState != null) {
            listaCategorias = (LinkedList<Categoria>)
                    savedInstanceState.getSerializable("CATEGORIAS",
                            LinkedList.class);
        }
        adapter = new CategoriaAdapter();
        lista = findViewById(R.id.listaCategorias);
        lista.setAdapter(adapter);
        lista.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                lista.setItemChecked(position, true);
                telaContas(view);
                return false;
            }
        });
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                lista.setItemChecked(position, true);
                editarCategoria(null);
            }
        });

        editor = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult res) {
                        if (res.getResultCode() == RESULT_OK) {
                            Categoria categoria = (Categoria) res.getData().getSerializableExtra("categoria");
                            listaCategorias.set(posicaoSelecionada, categoria);
                        }
                        adapter.notifyDataSetChanged();
                        posicaoSelecionada = -1;
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onSaveInstanceState(Bundle dados) {
        dados.putSerializable("CATEGORIAS", listaCategorias);
        super.onSaveInstanceState(dados);
    }

    public void salvarCategoria(View view) {
        if(posicaoSelecionada < 0) {
            Categoria categoria = new Categoria();
            categoria.setNome(edNomeCategoria.getText().toString());
            listaCategorias.add(categoria);
        } else {
            Categoria categoria = listaCategorias.get(posicaoSelecionada);
            categoria.setNome(edNomeCategoria.getText().toString());
        }
        posicaoSelecionada = -1;
        edNomeCategoria.setText("");
        adapter.notifyDataSetChanged();
    }

    public void editarCategoria(View view) {
        posicaoSelecionada = lista.getCheckedItemPosition();
        if (posicaoSelecionada >= 0) {
            Categoria categoria = listaCategorias.get(posicaoSelecionada);
            edNomeCategoria.setText(categoria.getNome());
        }
    }

    public void telaContas(View view) {
        posicaoSelecionada = lista.getCheckedItemPosition();
        if (posicaoSelecionada >= 0) {
            Categoria categoria = listaCategorias.get(posicaoSelecionada);
            Intent it = new Intent(this, TelaContas.class);
            it.putExtra("categoria", categoria);
            editor.launch(it);
        }
    }

    public void sair(MenuItem item) {
        finish();
    }

    public void remover(MenuItem item) {
        if (posicaoSelecionada != -1) {
            listaCategorias.remove(posicaoSelecionada);
            posicaoSelecionada = -1;
            adapter.notifyDataSetChanged();
        }
    }

    public void editarMenu(MenuItem item) {
        lista.setItemChecked(posicaoSelecionada, true);
        editarCategoria(null);
    }

    public void contasMenu(MenuItem item) {
        lista.setItemChecked(posicaoSelecionada, true);
        telaContas(null);
    }
}