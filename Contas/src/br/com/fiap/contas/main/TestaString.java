package br.com.fiap.contas.main;

/**
 *  Testes de imutabilidade de String.
 */
public class TestaString {
    public static void main(String[] args) {
        String s = "fj11";
        s.replaceAll("1", "2");
        System.out.println(s);

        String t = "fj11";
        t = t.replaceAll("1", "2");
        System.out.println(t);
    }
}
