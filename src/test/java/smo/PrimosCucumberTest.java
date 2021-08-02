package smo;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.LinkedList;

public class PrimosCucumberTest {

    private LinkedList<Integer> primos;
    private boolean verificandoPrimo;

    @Dado("uma lista de numeros primos")
    public void umaListaDeNumerosPrimos() {
        primos = PrimosNumber.sieveOfSundaramArray(1000);
    }

    @Quando("verificar o numero primo {int}")
    public void verificarONumeroPrimo(Integer primo) {
        verificandoPrimo = primos.get(0).equals(primo);
    }


    @Entao("o resultado será verdadeiro para a primeira posicao")
    public void oResultadoSeráVerdadeiroParaAPrimeiraPosicao() {
        Assert.assertTrue(verificandoPrimo);
    }
}