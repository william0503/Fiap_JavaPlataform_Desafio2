package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Testes de ordenação utilizando o Collections.sort
 */
public class TestaSort {
    public static void main(String[] args) {
        List<ContaCorrente> contas = new ArrayList<>();

        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Batemá");
        c1.setNumero(1);
        c1.setAgencia("1000");
        c1.deposita(100000);

        ContaCorrente c2 = new ContaCorrente();
        c2.setTitular("Coringa");
        c2.setNumero(2);
        c2.setAgencia("1000");
        c2.deposita(890000);


        ContaCorrente c3 = new ContaCorrente();
        c3.setTitular("Robin");
        c3.setNumero(2);
        c3.setAgencia("1000");
        c3.deposita(890000);

        contas.add(c3);
        contas.add(c2);
        contas.add(c1);

        System.out.println("Antes ordenação.");
        for (Conta conta: contas ) {
            System.out.println(conta.getTitular());
        }
        
        Collections.sort(contas);

        System.out.println("Após ordenação.");
        for (Conta conta: contas ) {
            System.out.println(conta.getTitular());
        }
    }
}
