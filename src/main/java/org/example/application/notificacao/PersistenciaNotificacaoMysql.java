package org.example.application.notificacao;

import org.example.application.autenticacao.Usuario;

public class PersistenciaNotificacaoMysql implements RepositorioNotificacao{
    @Override
    public void saveNotificacao(String mensagem, Usuario usuario) {
        System.out.println("Salvando notificação no banco de dados para " + usuario.getLogin() + ": " + mensagem);
    }
}
