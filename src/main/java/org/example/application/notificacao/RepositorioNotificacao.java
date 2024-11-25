package org.example.application.notificacao;

import org.example.application.autenticacao.Usuario;

public interface RepositorioNotificacao {

    void saveNotificacao(String mensagem, Usuario usuario);

}
