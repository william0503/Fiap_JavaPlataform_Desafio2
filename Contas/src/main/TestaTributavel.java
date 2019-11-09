package main;

import modelo.ContaCorrente;
import modelo.Tributavel;

public class TestaTributavel {

    public static void main (String[] args){
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.getValorImposto());

        Tributavel t = cc;
        System.out.println(t.getValorImposto());


    }

}
