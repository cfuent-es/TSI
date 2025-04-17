package com.example.tarefa;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    EditText edDescricao, edHoras;
    RadioGroup grupo;
    ListView lista;
    LinkedList<Tarefa> tarefas = new LinkedList<>();
    TarefaAdapter adapter;
    Tarefa tarefaEdicao = null;

    class TarefaAdapter extends ArrayAdapter<Tarefa>{
        public TarefaAdapter(){
            super(MainActivity.this, R.layout.item_lista_tarefa, tarefas);
        }

        @Override
        public View getView(int posicao, View view, ViewGroup parent){
            if(view == null){
                view = getLayoutInflater().inflate(R.layout.item_lista_tarefa, null);
            }
            Tarefa t = tarefas.get(posicao);
            ((TextView) view.findViewById(R.id.item_descricao)).setText(t.getDescricao());
            ((TextView) view.findViewById(R.id.item_horas)).setText(
                    String.valueOf(t.getHoras())
            );
            switch (t.getPrioridade()){
                case 'A' :
                    ((TextView) view.findViewById(R.id.item_prioridade)).setText("Alta");
                    break;
                case 'M' :
                    ((TextView) view.findViewById(R.id.item_prioridade)).setText("Media");
                    break;
                case 'B' :
                    ((TextView) view.findViewById(R.id.item_prioridade)).setText("Baixa");
                    break;
            }
            CheckBox cb = view.findViewById(R.id.item_feita);
            cb.setChecked(t.isFeita());
            cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    t.setFeita(isChecked);
                }
            });
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lista.setItemChecked(posicao, true);
                    notifyDataSetChanged();
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    lista.setItemChecked(posicao, true);
                    editar(null);
                    notifyDataSetChanged();
                    return false;
                }
            });
            if(lista.getCheckedItemPosition() == posicao)
                view.setBackgroundColor(Color.LTGRAY);
            else
                view.setBackgroundColor(Color.WHITE);
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

        edDescricao = findViewById(R.id.ed_descricao);
        edHoras = findViewById(R.id.ed_horas);
        grupo = findViewById(R.id.rg_prioridade);
        lista = findViewById(R.id.lista_tarefas);
        if(savedInstanceState != null) {
            tarefas = (LinkedList<Tarefa>) savedInstanceState.getSerializable("TAREFAS", LinkedList.class);
        }
        adapter = new TarefaAdapter();
        lista.setAdapter(adapter);
        lista.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                lista.setItemChecked(position, true);
                editar(null);
                return false;
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle dados){
        dados.putSerializable("TAREFAS", tarefas);
        super.onSaveInstanceState(dados);
    }

    public void editar (View v){
        int pos = lista.getCheckedItemPosition();
        if(pos >= 0){
            tarefaEdicao = tarefas.get(pos);
            edDescricao.setText(tarefaEdicao.getDescricao());
            edHoras.setText(String.valueOf(tarefaEdicao.getHoras()));
            if(tarefaEdicao.getPrioridade() == 'A')
                grupo.check(R.id.rb_alta);
            else if(tarefaEdicao.getPrioridade() == 'M')
                grupo.check(R.id.rb_media);
            else
                grupo.check(R.id.rb_baixa);
        }
    }

    public void confirmar (View v) {
        try {
            String descr = edDescricao.getText().toString();
            if(descr.trim().length() < 5) {
                Toast.makeText(this, R.string.msg_descr_vazia,
                        Toast.LENGTH_SHORT).show();
                return;
            }
            int horas = Integer.parseInt(edHoras.getText().toString());
            char prioridade = 'M';
            if (grupo.getCheckedRadioButtonId() == R.id.rb_alta)
                prioridade = 'A';
            else if (grupo.getCheckedRadioButtonId() == R.id.rb_baixa)
                prioridade = 'B';
            else {
                prioridade = 'M';
            }

            if (tarefaEdicao == null)
                adapter.add(new Tarefa(descr, horas, prioridade));
            else {
                tarefaEdicao.setDescricao(descr);
                tarefaEdicao.setHoras(horas);
                tarefaEdicao.setPrioridade(prioridade);
                tarefaEdicao = null;
                adapter.notifyDataSetChanged();
            }
            edDescricao.setText("");
            edHoras.setText("");
            grupo.check(R.id.rb_media);
        } catch (NumberFormatException nfe) {
            Toast.makeText(this, R.string.msg_erro_numero,
                    Toast.LENGTH_SHORT).show();
        }

    }

    public void remover(View v){
        int pos = lista.getCheckedItemPosition();
        if(pos == -1) {
            Toast.makeText(this,
                    "Selecione a tarefa a remover",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        adapter.remove(tarefas.get(pos));
        lista.clearChoices();
    }
}