package org.example.application.pagamento;

import org.example.application.notificacao.Notificacao;

import java.util.Arrays;
import java.util.List;

public class PagamentoService {
    private static PagamentoService pagamentoService;
    private final ApiPagamento apiPagamento;
    private final Notificacao notificacao;

    private PagamentoService(ApiPagamento apiPagamento, Notificacao notificacao) {
        this.apiPagamento = apiPagamento;
        this.notificacao = notificacao;
    }
    public Pagamento realizaPagamento(DadosPagamentoDto dadosPagamentoDto){
        Pagamento pagamento = integraPagamento(dadosPagamentoDto);
        notificacao.gerarNotificacao( "Pagamento gerado",dadosPagamentoDto.getUsuario());
        return pagamento;
    }
    public Pagamento integraPagamento(DadosPagamentoDto dadosPagamentoDto){
        validaValores(dadosPagamentoDto);
        String chave= apiPagamento.integrarPagamento(dadosPagamentoDto);
        return savePagamento(dadosPagamentoDto, chave);
    }
    public Pagamento savePagamento(DadosPagamentoDto dadosPagamentoDto, String chave){
        Pagamento pagamento = new Pagamento();
        pagamento.setCpf(dadosPagamentoDto.getUsuario().getCpf());
        pagamento.setData(dadosPagamentoDto.getData());
        pagamento.setChave(chave);
        pagamento.setValor(dadosPagamentoDto.getValor());
        pagamento.setStatus("Pendente");
        return pagamento;
    }
    private void validaValores(DadosPagamentoDto dadosPagamentoDto){
        //logica de validacao de valores

    }

    public String consultaPagamentoRealizado(String chave){
        return apiPagamento.consultarPagamentoRealizado(chave);
    }
    public List<String> consultaFormasPagamento(){
        return Arrays.asList("Credito", "Debito", "Boleto", "PIX");
    }
    public static PagamentoService getPagamentoService(ApiPagamento apiPagamento, Notificacao notificacao){
        if(pagamentoService == null){
            pagamentoService = new PagamentoService(apiPagamento, notificacao);
        }
        return pagamentoService;
    }

}
