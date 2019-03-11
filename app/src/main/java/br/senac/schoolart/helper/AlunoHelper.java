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
    private Aluno aluno;

    public AlunoHelper(CadastroAlunoActivity activity) {
        carregaCampos(activity, new Aluno());
    }

    public AlunoHelper(EdicaoAlunoActivity activity, Aluno aluno) {
       carregaCampos(activity, aluno);
    }


    private void carregaCampos(Activity activity, Aluno aluno){
        this.aluno = aluno;
        txtNome = activity.findViewById(R.id.cadAlunoTxtNome);
        txtTelefone = activity.findViewById(R.id.cadAlunoTxtTelefone);
        txtEmail = activity.findViewById(R.id.cadAlunoTxtEmail);
        txtSite = activity.findViewById(R.id.cadAlunoTxtSite);
        rbarNota = activity.findViewById(R.id.rbarNota);
    }

    public void carregaCampos(Aluno aluno){
        this.aluno = aluno;
        txtNome.setText(aluno.getNome());
        txtTelefone.setText(aluno.getTelefone());
        txtEmail.setText(aluno.getEmail());
        txtSite.setText(aluno.getSite());
        rbarNota.setRating((float)aluno.getNota());
    }
    public Aluno getAluno() {
        String nome = txtNome.getText().toString();
        String telefone = txtTelefone.getText().toString();
        String email = txtEmail.getText().toString();
        String site = txtSite.getText().toString();
        double nota = rbarNota.getRating();

        return new Aluno(aluno.getIdAluno(),nome, telefone, email, site,nota);
    }

    public boolean validaCamposVazios(){
        boolean validar = true;
        if (txtNome.getText().toString().isEmpty()) {
            txtNome.setError("Por favor informe o nome!");
            validar = false;
        }

        if (txtTelefone.getText().toString().isEmpty()) {
            txtTelefone.setError("Por favor informe o telefone!");
            validar = false;
        }

        if (txtEmail.getText().toString().isEmpty()) {
            txtEmail.setError("Por favor informe o email!");
            validar = false;
        }

        if (txtSite.getText().toString().isEmpty()) {
            txtSite.setError("Por favor informe o site!");
            validar = false;
        }

        return validar;
    }
}
