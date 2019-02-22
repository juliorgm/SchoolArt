package br.senac.schoolart.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.senac.schoolart.model.Aluno;

//SQLITE RELACIONAL
public class AlunoDAO extends SQLiteOpenHelper {
    public AlunoDAO(Context context) {
        super(context, "AgendaAlunos", null, 1);
    }

    //Chamado quando o banco de dados é criado pela primeira vez.
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table alunos(" +
                " idAluno INTEGER PRIMARY KEY AUTOINCREMENT," +
                " nome text not null," +
                " telefone TEXT NOT null," +
                " email text NOT null UNIQUE," +
                " site TEXT," +
                " nota DECIMAL not null)";
        db.execSQL(sql);
    }

    //Chamado quando o banco de dados precisa ser atualizado
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long inserir(Aluno aluno){
        ContentValues dados = new ContentValues();
        dados.put("nome",aluno.getNome());
        dados.put("telefone",aluno.getTelefone());
        dados.put("email",aluno.getEmail());
        dados.put("site",aluno.getSite());
        dados.put("nota",aluno.getNota());

        SQLiteDatabase db = getWritableDatabase();
        return db.insert("alunos",null ,dados);
    }
}








