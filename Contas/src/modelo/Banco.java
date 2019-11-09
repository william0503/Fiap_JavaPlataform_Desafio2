package modelo;

import java.util.List;

public class Banco {
    private String nome;
    private int numero;
    private Conta[] contasA;
    private List<Conta> contas;
    private int id = 0;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contasA = new Conta[10];
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void adiciona(Conta conta){
        for (int i = 0; i < this.contasA.length; i++) {
            if(contasA[i] == null) {
                 contasA[i] = conta;
                break;
            }
        }
    }

    public void mostraContas(){
        for (int i = 0; i < this.contasA.length; i++) {

            if(contasA[i] == null)
                continue;

            System.out.println("Conta na posição " + i);
            System.out.println("Titular: " + contasA[i].getTitular());
            System.out.println("Agencia: " + contasA[i].getAgencia());
            System.out.println("Conta: " + contasA[i].getNumero());
            System.out.println("");
        }
    }
}
