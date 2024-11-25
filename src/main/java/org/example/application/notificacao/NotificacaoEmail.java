package org.example.application.notificacao;

import org.example.application.autenticacao.Usuario;

public class NotificacaoEmail implements Notificacao{

    private final RepositorioNotificacao repositorioNotificacao;

    public NotificacaoEmail(RepositorioNotificacao repositorioNotificacao) {
        this.repositorioNotificacao = repositorioNotificacao;
    }

    @Override
    public void gerarNotificacao(String mensagem, Usuario usuario) {
        System.out.println("Enviando e-mail para " + usuario.getLogin() + ": " + mensagem);
        repositorioNotificacao.saveNotificacao(mensagem, usuario);
    }

    public RepositorioNotificacao getRepositorioNotificacao() {
        return repositorioNotificacao;
    }
}
