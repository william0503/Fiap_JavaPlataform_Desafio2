package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;

/**
 * Testa a criaçao de contas corrente e poupança e as vincula com um banco.
 */
public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco ("CaelumBank", 999);

        ContaCorrente cc1 = new ContaCorrente();
        cc1.setTitular("Batemá");
        cc1.setNumero(1);
        cc1.setAgencia("1000");
        cc1.deposita(100000);

        ContaPoupanca cp2 = new ContaPoupanca();
        cp2.setTitular("Coringa");
        cp2.setNumero(2);
        cp2.setAgencia("1000");
        cp2.deposita(890000);

        banco.adicionaArray(cc1);
        banco.adicionaArray(cp2);

        for (int i = 0; i < 5; i++) {
            ContaCorrente conta = new ContaCorrente();
            conta.setTitular("Titular " + i);
            conta.setNumero(i);
            conta.setAgencia("1000");
            conta.deposita( i * 1000);
            banco.adicionaArray(conta);
        }

        banco.mostraContasArray();
    }
}
