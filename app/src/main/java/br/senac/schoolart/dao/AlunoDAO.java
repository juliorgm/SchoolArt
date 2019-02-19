package br.senac.schoolart.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//SQLITE RELACIONAL
public class AlunoDAO extends SQLiteOpenHelper {
    public AlunoDAO(Context context) {
        super(context, "AgendaAlunos", null, 1);
    }

    //Chamado quando o banco de dados é criado pela primeira vez.
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    //Chamado quando o banco de dados precisa ser atualizado
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
