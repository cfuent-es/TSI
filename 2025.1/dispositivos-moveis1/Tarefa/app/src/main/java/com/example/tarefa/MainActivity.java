package com.example.tarefa;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    EditText edDescricao, edHoras;
    RadioGroup grupo;
    ListView lista;
    LinkedList<Tarefa> tarefas = new LinkedList<>();

    ArrayAdapter<Tarefa> adapter;

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
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_single_choice,
                tarefas);
        lista.setAdapter(adapter);
        lista.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
    }

    public void confirmar (View v) {
        String descr = edDescricao.getText().toString();
        int horas = Integer.parseInt(edHoras.getText().toString());
        char prioridade = 'M';
        if(grupo.getCheckedRadioButtonId() == R.id.rb_alta)
            prioridade = 'A';
        else if(grupo.getCheckedRadioButtonId() == R.id.rb_baixa)
            prioridade = 'B';
        else {
            prioridade = 'M';
        }

        adapter.add(new Tarefa(descr, horas, prioridade));
        edDescricao.setText("");
        edHoras.setText("");

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