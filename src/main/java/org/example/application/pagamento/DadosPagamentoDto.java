package org.example.application.pagamento;

import org.example.application.autenticacao.Usuario;

import java.util.Date;

public class DadosPagamentoDto {

    private Usuario usuario;
    private double valor;
    private Date data;

    public DadosPagamentoDto() {
    }

    public DadosPagamentoDto(Usuario usuario, double valor, Date data) {
        this.usuario = usuario;
        this.valor = valor;
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
