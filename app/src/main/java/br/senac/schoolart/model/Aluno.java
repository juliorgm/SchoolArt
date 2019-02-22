package br.senac.schoolart.model;

public class Aluno {
    private int idAluno;
    private String nome;
    private String telefone;
    private String email;
    private String site;
    private double nota;

    public Aluno(String nome, String telefone, String email, String site, double nota) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.site = site;
        this.nota = nota;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSite() {
        return site;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nome;
    }
}
