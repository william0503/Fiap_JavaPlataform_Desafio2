package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArray {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        for (int i = 0; i < contas.length; i++) {
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100);

            contas[i] = conta;
        }

        double total = 0;
        for (int i = 0; i < contas.length; i++) {
            total += contas[i].getSaldo();
        }
        System.out.println(total / contas.length);
    }
}
