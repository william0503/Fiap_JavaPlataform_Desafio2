package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Testa a lista com inclusao de depositos de volores randomicos em conta corrente.
 */
public class TestaLista {
    public static void main(String[] args) {
        List<Conta> contas = new LinkedList<Conta>();
        Random rdm = new Random();

        for (int i = 0; i < 5; i++) {
            ContaCorrente conta = new ContaCorrente();
            conta.setTitular("Titular " + i);
            conta.setNumero(i);
            conta.setAgencia("1000");
            conta.deposita(Math.abs(rdm.nextInt(1000)));
            contas.add(conta);
        }

        System.out.println(contas);
    }
}
