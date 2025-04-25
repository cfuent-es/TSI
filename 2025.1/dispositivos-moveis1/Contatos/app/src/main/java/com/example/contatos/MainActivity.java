package com.example.contatos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    LinkedList<Contato> contatos;
    ArrayAdapter<Contato> adapter;
    ListView lista;
    int posEdicao = -1;
    ActivityResultLauncher<Intent> editor;

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
        contatos = new LinkedList<>();
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_single_choice,
                contatos);
        lista = findViewById(R.id.lista_contatos);
        lista.setAdapter( adapter );
        lista.setChoiceMode( AbsListView.CHOICE_MODE_SINGLE );
        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent,
                                           View view, int position, long id) {
                Contato c = contatos.get( position );
                if (c.telefone != null) {
                    Intent ligar = new Intent(Intent.ACTION_DIAL);
                    ligar.setData(Uri.parse("tel:"+c.telefone));
                    startActivity( ligar );
                }
                return false;
            }
        });
        editor = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult res) {
                        if (res.getResultCode() == RESULT_OK) {
                            Contato c = (Contato) res.getData()
                                    .getSerializableExtra("contato");
                            if (posEdicao == -1) {
                                adapter.add(c);
                            } else {
                                contatos.set(posEdicao, c);
                                adapter.notifyDataSetChanged();
                            }
                        }
                        posEdicao = -1;
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

    public void novo(MenuItem item) {
        novo((View) null);
    }

    public void editar(MenuItem item) {
        editar((View) null);
    }

    public void remover(MenuItem item) {
        int pos = lista.getCheckedItemPosition();
        if (pos >= 0) {
            adapter.remove( contatos.get(pos) );
        }
    }

    public void sair(MenuItem item) {
        finish();
    }

    public void novo(View item) {
        Intent it = new Intent(this, TelaContatos.class);
        editor.launch(it);
        //startActivityForResult( it, 123);
    }

    public void editar(View v) {
        posEdicao = lista.getCheckedItemPosition();
        if ( posEdicao >= 0) {
            Contato c = contatos.get( posEdicao );
            Intent it = new Intent(this, TelaContatos.class);
            it.putExtra("contatoEdicao", c);
            // startActivityForResult(it, 234);
            editor.launch(it);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Contato retorno = (Contato) data.getSerializableExtra("contato");
            if (requestCode == 123) {
                adapter.add(retorno);
            } else if (requestCode == 234) {
                contatos.set( posEdicao, retorno);
                adapter.notifyDataSetChanged();
                posEdicao = -1;
            }
        }
    }
}