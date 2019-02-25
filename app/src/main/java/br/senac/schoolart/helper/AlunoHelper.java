package br.senac.schoolart.helper;

import android.app.Activity;
import android.widget.EditText;
import android.widget.RatingBar;

import br.senac.schoolart.CadastroAlunoActivity;
import br.senac.schoolart.EdicaoAlunoActivity;
import br.senac.schoolart.R;
import br.senac.schoolart.model.Aluno;

public class AlunoHelper {
    private EditText txtNome;
    private EditText txtTelefone;
    private EditText txtEmail;
    private EditText txtSite;
    private RatingBar rbarNota;

    public AlunoHelper(CadastroAlunoActivity activity) {
        carregaCampos(activity);
    }

    public AlunoHelper(EdicaoAlunoActivity activity) {
       carregaCampos(activity);
    }

    private void carregaCampos(Activity activity){
        txtNome = activity.findViewById(R.id.cadAlunoTxtNome);
        txtTelefone = activity.findViewById(R.id.cadAlunoTxtTelefone);
        txtEmail = activity.findViewById(R.id.cadAlunoTxtEmail);
        txtSite = activity.findViewById(R.id.cadAlunoTxtSite);
        rbarNota = activity.findViewById(R.id.rbarNota);
    }

    public Aluno getAluno() {
        String nome = txtNome.getText().toString();
        String telefone = txtTelefone.getText().toString();
        String email = txtEmail.getText().toString();
        String site = txtSite.getText().toString();
        double nota = rbarNota.getRating();

        return new Aluno(nome, telefone, email, site,nota);
    }
}
