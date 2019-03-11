package br.senac.schoolart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.senac.schoolart.dao.AlunoDAO;
import br.senac.schoolart.helper.AlunoHelper;
import br.senac.schoolart.model.Aluno;

public class EdicaoAlunoActivity extends AppCompatActivity {

    public static final int LINHA_AFETADA = 1;
    private TextView txtTitulo;
    private AlunoHelper helper;
    private Button btnCadastrarAluno;
    private Button btnExluiAluno;
    private Aluno aluno;
    private AlunoDAO alunoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cadastro_aluno);

            txtTitulo = findViewById(R.id.txtTituloCadAluno);
            txtTitulo.setText("Detalhe de Aluno");

            btnExluiAluno = findViewById(R.id.btnExcluir);
            btnExluiAluno.setVisibility(View.VISIBLE);

            alunoDAO = new AlunoDAO(this);

            btnExluiAluno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (alunoDAO.deletar(aluno.getIdAluno()) == LINHA_AFETADA)
                        finish();
                }
            });

            helper = new AlunoHelper(this,aluno);

            //Recuperando a Intent
            Intent intent = getIntent();
            //Recuperando o aluno que veio do listview - MainActivity
            aluno = (Aluno) intent.getSerializableExtra(MainActivity.MAIN_ALUNO);

            //Verificando se o aluno é nulo
            if (aluno != null)
                //Carrega as informações do aluno no formulario
                helper.carregaCampos(aluno);

            btnCadastrarAluno = findViewById(R.id.btnCadastrarAluno);

            //Edição do aluno
            btnCadastrarAluno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    aluno = helper.getAluno();

                    if(alunoDAO.editar(aluno)== LINHA_AFETADA){
                        finish();
                    }
                }
            });
    }
}
