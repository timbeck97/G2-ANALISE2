package org.example.application.passagem;

import org.example.application.autenticacao.Usuario;
import org.example.application.notificacao.Notificacao;

public class PassagemService {

    private final Notificacao notificacao;

    public PassagemService(Notificacao notificacao) {
        this.notificacao = notificacao;
    }


    public Passagem solicitaPassagem(ViagemDto viagemDto, String tipoPagamento, Usuario usuario){
        Passagem passagem=registrarPassagem(viagemDto, tipoPagamento, usuario);
        return passagem;
    }

    private Passagem registrarPassagem(ViagemDto viagemDto, String tipoPagamento, Usuario usuario){
        Passagem passagem=new Passagem();
        passagem.setOrigem(viagemDto.getOrigem());
        passagem.setDestino(viagemDto.getDestino());
        passagem.setHorario(viagemDto.getHorario());
        passagem.setAssento(viagemDto.getAssento());
        passagem.setTipoPagamento(tipoPagamento);
        passagem.setUsuario(usuario);
        notificacao.gerarNotificacao("Passagem solicitada com sucesso",usuario) ;
        return passagem;
    }
}
