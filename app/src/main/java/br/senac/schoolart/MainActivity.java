package br.senac.schoolart;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.senac.schoolart.dao.AlunoDAO;
import br.senac.schoolart.model.Aluno;

public class MainActivity extends AppCompatActivity {

    private ListView listViewAlunos;
    private FloatingActionButton fabAddAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewAlunos = findViewById(R.id.listViewAlunos);
        fabAddAluno = findViewById(R.id.fabAddAluno);

        fabAddAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        CadastroAlunoActivity.class);
                startActivity(intent);
            }
        });

        listViewAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();

        AlunoDAO alunoDAO = new AlunoDAO(this);
        List<Aluno> aluno = alunoDAO.listaTodosAlunos();

        ArrayAdapter<Aluno> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,aluno);

        listViewAlunos.setAdapter(adapter);
    }
}
