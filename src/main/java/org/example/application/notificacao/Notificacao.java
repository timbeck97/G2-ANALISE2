package org.example.application.notificacao;

import org.example.application.autenticacao.Usuario;

public interface Notificacao {

        void gerarNotificacao(String mensagem, Usuario usuario);
}
