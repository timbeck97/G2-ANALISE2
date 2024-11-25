package org.example.application.pagamento;

import java.util.Date;

public class Pagamento {

    private String cpf;
    private String chave;
    private double valor;
    private Date data;
    private String status;

    public Pagamento() {
    }

    public Pagamento(String cpf, String chave, double valor, Date data, String status) {
        this.cpf = cpf;
        this.chave = chave;
        this.valor = valor;
        this.data = data;
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "cpf='" + cpf + '\'' +
                ", chave='" + chave + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                ", status='" + status + '\'' +
                '}';
    }
}
