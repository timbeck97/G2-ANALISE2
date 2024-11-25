package org.example.application.pagamento;

public class ApiPagamentoPaypal implements ApiPagamento{

    @Override
    public String integrarPagamento(DadosPagamentoDto dadosPagamentoDto) {
        System.out.println("Integrando pagamento via Paypal");
        return "55h4fgj57r4egbvm4";
    }

    @Override
    public String consultarPagamentoRealizado(String chave) {
        return "PAGO";
    }
}
