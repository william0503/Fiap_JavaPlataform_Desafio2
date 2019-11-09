package main;

import modelo.Conta;
import modelo.ContaCorrente;

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
