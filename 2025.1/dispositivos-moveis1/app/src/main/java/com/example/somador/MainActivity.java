package com.example.somador;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText entrada;
    TextView saida;
    double total = 0;


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
        entrada = findViewById(R.id.ed_numero);
        saida = findViewById(R.id.txt_total);
        if(savedInstanceState != null){
            total = savedInstanceState.getDouble("TOTAL", 0.0);
            saida.setText("Total: 0" + total);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle dados) {
        dados.putDouble("TOTAL", total);
        super.onSaveInstanceState(dados);
    }

    public void adicionar (View v) {
        double valor = Double.parseDouble();
        total += valor;
        entrada.setText("");
        saida.setText("Total: " + total);
    }

    public void limpar (View v) {
        total = 0;
        saida.setText("Total: 0");
        entrada.setText("");
    }
}