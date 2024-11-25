package org.example.application.autenticacao;

public class Usuario {
    private String cpf;
    private String nome;
    private String logradouro;
    private String numero;
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String cpf, String nome, String logradouro, String numero, String login, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.login = login;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
