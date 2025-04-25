package com.example.contatos;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaContatos extends AppCompatActivity {

    EditText edNome, edFone, edEmail;
    Spinner spCategoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_contatos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edNome = findViewById(R.id.ed_nome);
        edFone = findViewById(R.id.ed_fone);
        edEmail = findViewById(R.id.ed_email);
        spCategoria = findViewById(R.id.sp_categoria);
        Contato c = (Contato) getIntent().getSerializableExtra("contatoEdicao");
        if (c != null) {
            edNome.setText( c.nome );
            edEmail.setText( c.email );
            edFone.setText(c.telefone);
            switch( c.categoria) {
                case 'T' : spCategoria.setSelection(0); break;
                case 'A' : spCategoria.setSelection(1); break;
                case 'F' : spCategoria.setSelection(2); break;
                case 'C' : spCategoria.setSelection(3); break;
            }
        }
    }

    public void confirmar(View v) {
        char categoria = ((String) spCategoria.getSelectedItem()).charAt(0);
        Contato c = new Contato(edNome.getText().toString(),
                  edFone.getText().toString(), edEmail.getText().toString(), categoria);
        Intent resposta = new Intent();
        resposta.putExtra("contato", c);
        setResult(RESULT_OK, resposta);
        finish();
    }
}