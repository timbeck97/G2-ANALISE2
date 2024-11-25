package org.example.application.passagem;

import org.example.application.autenticacao.Usuario;

public class Passagem {
    private String origem;
    private String destino;
    private String horario;
    private int assento;
    private String tipoPagamento;
    private Usuario usuario;

    public Passagem() {
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getAssento() {
        return assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Passagem{" +
                "origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", horario='" + horario + '\'' +
                ", assento=" + assento +
                ", tipoPagamento='" + tipoPagamento + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
