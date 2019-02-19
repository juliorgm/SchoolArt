package br.senac.schoolart;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

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

        List<Aluno> aluno = new ArrayList<>();
        aluno.add(new Aluno("Asdrubal Mota","91980987751",
                "asdrubal@gmail.com","rhempresa.com.br",8.6));

        aluno.add(new Aluno("Maxuldeílde Venâncio","91966889911",
                "uldi@schoolart.com","schoolart.com.br",9.3));

        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));

        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));
        aluno.add(new Aluno("Estragobirobaldo Juvêncio","81933221155",
                "baldo@schoolart.com","schoolart.com.br",9.8));


        ArrayAdapter<Aluno> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,aluno);

        listViewAlunos.setAdapter(adapter);
    }
}
