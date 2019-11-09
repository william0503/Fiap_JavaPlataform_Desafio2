package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;

public class TesteDaContaList {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco ("CaelumBank", 999);

        //Conta Corrente
        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Titular Conta Corrente");
        c1.setNumero(1);
        c1.setAgencia("1000");
        banco.adiciona(c1);

        //Conta Poupança
        ContaPoupanca c2 = new ContaPoupanca();
        c2.setTitular("Titular Conta Poupança");
        c2.setNumero(2);
        c2.setAgencia("1000");
        banco.adiciona(c2);

        //mostra lista de contas
        banco.mostraContas();

        //utiliza o pega pra listar as contas
        System.out.println(banco.pega(0));
        System.out.println(banco.pega(1));

        //Tenta inserir o mesmo Titular
        ContaCorrente c3 = new ContaCorrente();
        c3.setTitular("Titular Conta Corrente");
        c3.setNumero(3);
        c3.setAgencia("1000");
        banco.adiciona(c3);

    }
}
