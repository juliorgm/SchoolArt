package br.senac.schoolart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.senac.schoolart.helper.AlunoHelper;
import br.senac.schoolart.model.Aluno;

public class EdicaoAlunoActivity extends AppCompatActivity {

    private TextView txtTitulo;
    private AlunoHelper helper;
    private Button btnCadastrarAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        txtTitulo = findViewById(R.id.txtTituloCadAluno);
        txtTitulo.setText("Detalhe de Aluno");

        helper = new AlunoHelper(this);

        btnCadastrarAluno = findViewById(R.id.btnCadastrarAluno);

        btnCadastrarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aluno aluno = helper.getAluno();
            }
        });
    }
}
