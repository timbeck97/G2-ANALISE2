package org.example.application.passagem;

import java.util.ArrayList;
import java.util.List;

public class ConsultaOnibus {

    private String origem;
    private String destino;


    public ConsultaOnibus() {
    }

    public ConsultaOnibus(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public List<ViagemDto> consultarOnibus() {
        // implementar logica de consulta de passagens disponiveis
        List<ViagemDto> viagens=new ArrayList<>();
        viagens.add(new ViagemDto("São Paulo","Rio de Janeiro","10:00",10));
        viagens.add(new ViagemDto("São Paulo","Rio de Janeiro","12:00",12));
        viagens.add(new ViagemDto("São Paulo","Rio de Janeiro","14:00",25));
        viagens.add(new ViagemDto("São Paulo","Rio de Janeiro","16:00",8));
        return viagens;
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

}
