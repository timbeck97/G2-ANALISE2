package org.example.application.pagamento;

public interface ApiPagamento {

    String integrarPagamento(DadosPagamentoDto dadosPagamentoDto);

    String consultarPagamentoRealizado(String chave);
}
