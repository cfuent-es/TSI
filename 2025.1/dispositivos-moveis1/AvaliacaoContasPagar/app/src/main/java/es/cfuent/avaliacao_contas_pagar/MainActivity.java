package es.cfuent.avaliacao_contas_pagar;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    EditText edNomeCategoria;
    LinkedList<Categoria> listaCategorias;
    ArrayAdapter<Categoria> adapter;
    ListView lista;

    int posicaoSelecionada = -1;

    class CategoriaAdapter extends ArrayAdapter<Categoria> {
        public CategoriaAdapter(){ super(MainActivity.this, R.layout.item_lista_categoria, listaCategorias); }

        @Override
        public View getView(int posicao, View view, ViewGroup parent){
            if(view == null){
                view = getLayoutInflater().inflate(R.layout.item_lista_categoria, null);
            }
            Categoria cat = listaCategorias.get(posicao);
            ((TextView) view.findViewById(R.id.item_nome_categoria)).setText(cat.getNome());
            ((TextView) view.findViewById(R.id.item_total_value)).setText("R$ 123,45");
            ((TextView) view.findViewById(R.id.item_pago_value)).setText("R$ 123,45");
            ((TextView) view.findViewById(R.id.item_apagar_value)).setText("R$ 123,45");
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
        edNomeCategoria = findViewById(R.id.edNomeCategoria);
        listaCategorias = new LinkedList<>();
        adapter = new CategoriaAdapter();
        lista = findViewById(R.id.listaCategorias);
        lista.setAdapter(adapter);
        lista.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                lista.setItemChecked(position, true);
                editarCategoria(null);
                return false;
            }
        });

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
}