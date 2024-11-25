package org.example.application.passagem;

public class ViagemDto {
    private String origem;
    private String destino;
    private String horario;
    private int assento;

    public ViagemDto(String origem, String destino, String horario, int assento) {
        this.origem = origem;
        this.destino = destino;
        this.horario = horario;
        this.assento = assento;
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
}
