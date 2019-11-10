package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

/**
 * Testa um Map, adicionando e recuperando valores.
 */
public class TestaMapa {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente();
        cc1.deposita(10000);

        Conta cc2 = new ContaCorrente();
        cc2.deposita(3000);

        Map<String, Conta> mapaDeContas = new HashMap();

        mapaDeContas.put("diretor", cc1);
        mapaDeContas.put("gerente", cc2);

        Conta contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}