package br.senac.schoolart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.senac.schoolart.dao.AlunoDAO;
import br.senac.schoolart.helper.AlunoHelper;
import br.senac.schoolart.model.Aluno;

public class CadastroAlunoActivity extends AppCompatActivity {
    private AlunoHelper helper;
    private AlunoDAO alunoDAO;
    private Button btnCadastrarAluno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnCadastrarAluno = findViewById(R.id.btnCadastrarAluno);
        helper = new AlunoHelper(this);
        alunoDAO = new AlunoDAO(this);

        btnCadastrarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aluno aluno = helper.getAluno();
                if(helper.validaCamposVazios()){
                    if(alunoDAO.inserir(aluno)==-1){
                        Toast.makeText(CadastroAlunoActivity.this,
                                "Não inseriu",Toast.LENGTH_LONG).show();
                    }else{
                        finish();
                    }
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
