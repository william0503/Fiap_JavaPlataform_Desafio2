package modelo;

public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas;
    private int id = 0;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new Conta[10];
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void adiciona(Conta conta){
        for (int i = 0; i < this.contas.length; i++) {
            if(contas[i] == null) {
                 contas[i] = conta;
                break;
            }
        }
    }

    public void mostraContas(){
        for (int i = 0; i < this.contas.length; i++) {

            if(contas[i] == null)
                continue;

            System.out.println("Conta na posição " + i);
            System.out.println("Titular: " + contas[i].getTitular());
            System.out.println("Agencia: " + contas[i].getAgencia());
            System.out.println("Conta: " + contas[i].getNumero());
            System.out.println("");
        }
    }
}
