package org.example;

import org.example.application.MainController;
import org.example.application.autenticacao.Usuario;
import org.example.application.notificacao.Notificacao;
import org.example.application.notificacao.NotificacaoEmail;
import org.example.application.notificacao.PersistenciaNotificacaoMysql;
import org.example.application.notificacao.RepositorioNotificacao;
import org.example.application.pagamento.*;
import org.example.application.passagem.Passagem;
import org.example.application.passagem.PassagemService;
import org.example.application.passagem.ViagemDto;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instanciando as classes necessárias

        //API PAGAMENTO PAIPAL QUE IMPLEMENTA A INTERFACE API PAGAMENTO
        ApiPagamento apiPagamento = new ApiPagamentoPaypal();
        //repositorio para salvar notificacoes
        RepositorioNotificacao repositorioNotificacao = new PersistenciaNotificacaoMysql();
        Notificacao notificacaoEmail = new NotificacaoEmail(repositorioNotificacao);
        //pagamento service, que recebe as instancias da api de pagamento externa e a classe de envio de notificacao
        PagamentoService pagamentoService = PagamentoService.getPagamentoService(apiPagamento, notificacaoEmail);
        PassagemService passagemService = new PassagemService(notificacaoEmail);
        //controller que recebe todos services
        MainController mainController = new MainController(pagamentoService, passagemService, notificacaoEmail);

        //FLUXO DE TESTE
        //cria uma nova conta
        Usuario joao = mainController.criarNovaConta("99999999999", "João", "Rua 1", "123", "joao", "123");
        //consulta viagens disponiveis
        List<ViagemDto> viagensDisponiveis = mainController.consultaOnibus("São Paulo", "Rio de Janeiro");
        List<String> formasPagamento = mainController.consultaFormasPagamento();
        //seleciona viagem
        ViagemDto viagemSelecionada = viagensDisponiveis.get(0);
        //seleciona forma de pagamento desejada
        String formaPagamento = formasPagamento.get(0);
        //solicita compra da passagem
        Passagem passagem = mainController.solicitaPassagem(viagemSelecionada, formaPagamento, joao);
        System.out.println("Passagem comprada com sucesso: " + passagem.toString());

        //realiza pagamento
        Pagamento pagamento = mainController.realizaPagamento(new DadosPagamentoDto(joao, 100.0, new Date()));

        System.out.println("Dados do pagamento: " + pagamento);




    }
}