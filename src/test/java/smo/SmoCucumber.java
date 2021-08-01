package smo;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class SmoCucumber {

    @Dado("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {
        System.out.println("criei o arquivo");
    }
    @Quando("executar o arquivo")
    public void executarOArquivo() {
        System.out.println("executar arquivo");

    }
    @Entao("a executação deve finalizar com sucesso")
    public void aExecutaçãoDeveFinalizarComSucesso() {
        System.out.println("finalizar com sucesso");
    }
}
