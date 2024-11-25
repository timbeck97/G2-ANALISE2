package org.example.application.autenticacao;

import org.example.application.notificacao.Notificacao;

public class Admin {

    private final Notificacao notificacao;

    public Admin(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public Usuario criarNovaConta(String cpf,String nome, String logradouro, String numero, String login, String senha) {
        verificarDados(cpf,nome, logradouro, numero, login, senha);
        Usuario usuario = new Usuario();
        usuario.setCpf(cpf);
        usuario.setNome(nome);
        usuario.setLogradouro(logradouro);
        usuario.setNumero(numero);
        usuario.setLogin(login);
        usuario.setSenha(senha);

        notificacao.gerarNotificacao("Conta criada com sucesso", usuario);

        return usuario;
    }
    private void verificarDados(String cnpj,String nome, String logradouro, String numero, String login, String senha) {
        // logica para validacao dos dados para cadastro
    }

}
