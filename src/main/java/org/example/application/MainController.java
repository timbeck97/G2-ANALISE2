package org.example.application;

import org.example.application.autenticacao.Admin;
import org.example.application.autenticacao.Usuario;
import org.example.application.notificacao.Notificacao;
import org.example.application.pagamento.DadosPagamentoDto;
import org.example.application.pagamento.Pagamento;
import org.example.application.pagamento.PagamentoService;
import org.example.application.passagem.ConsultaOnibus;
import org.example.application.passagem.Passagem;
import org.example.application.passagem.PassagemService;
import org.example.application.passagem.ViagemDto;

import java.util.List;

public class MainController {

    private final PagamentoService pagamentoService;
    private final PassagemService passagemService;
    private final Notificacao notificacao;


    public MainController(PagamentoService pagamentoService, PassagemService passagemService, Notificacao notificacao) {
        this.pagamentoService = pagamentoService;
        this.passagemService = passagemService;
        this.notificacao = notificacao;
    }
    public Usuario criarNovaConta(String cpf, String nome, String logradouro, String numero, String login, String senha){
        Admin admin=new Admin(notificacao);
        return admin.criarNovaConta(cpf, nome, logradouro, numero, login, senha);
    }
    public List<ViagemDto> consultaOnibus(String origem, String destino){
        ConsultaOnibus consultaOnibus = new ConsultaOnibus(origem, destino);
        return consultaOnibus.consultarOnibus();
    }
    public Pagamento realizaPagamento(DadosPagamentoDto dadosPagamentoDto){
        return pagamentoService.realizaPagamento(dadosPagamentoDto);
    }
    public List<String> consultaFormasPagamento(){
        return pagamentoService.consultaFormasPagamento();
    }
    public Passagem solicitaPassagem(ViagemDto viagemDto, String tipoPagamento,Usuario usuario){
        return passagemService.solicitaPassagem(viagemDto, tipoPagamento, usuario);
    }

}
