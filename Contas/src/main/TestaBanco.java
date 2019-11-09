package main;

import modelo.Banco;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco ("CaelumBank", 999);

        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Batemá");
        c1.setNumero(1);
        c1.setAgencia("1000");
        c1.deposita(100000);
        banco.adicionaArray(c1);

        ContaPoupanca c2 = new ContaPoupanca();
        c2.setTitular("Coringa");
        c2.setNumero(2);
        c2.setAgencia("1000");
        c2.deposita(890000);
        banco.adicionaArray(c2);

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
