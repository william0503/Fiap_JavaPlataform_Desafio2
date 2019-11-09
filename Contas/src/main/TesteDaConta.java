package main;

import modelo.*;

public class TesteDaConta {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        System.out.println(cc.getTipo());
        System.out.println(cp.getTipo());

        SeguroDeVida cs = new SeguroDeVida();
        System.out.println(cs.getTipo());

        //cc.deposita(-100);
        //cc.saca(10);
        System.out.println(cc);
        System.out.println(cp);

    }
}
