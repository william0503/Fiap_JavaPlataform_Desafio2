package br.com.fiap.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa uma empresa que presta serviços financeiros diversos como saques e depósitos.
 */
public class Banco {
    private String nome;
    private int numero;
    private Conta[] contasA;
    private List<Conta> contas;
    private int id = 0;
    private Map<String, Conta> contaMap;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contasA = new Conta[10];
        this.contas = new ArrayList<>();
        this.contaMap = new HashMap();
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void adicionaArray(Conta conta) {
        for (int i = 0; i < this.contasA.length; i++) {
            if (contasA[i] == null) {
                contasA[i] = conta;
                break;
            }
        }
    }

    public void mostraContasArray() {
        for (int i = 0; i < this.contasA.length; i++) {

            if (contasA[i] == null) continue;

            System.out.println("Conta na posição " + i);
            System.out.println("Titular: " + contasA[i].getTitular());
            System.out.println("Agencia: " + contasA[i].getAgencia());
            System.out.println("Conta: " + contasA[i].getNumero());
            System.out.println("");
        }
    }

    public void adiciona(Conta c) throws Exception {
        if (buscaPorTitular(c.getTitular()) != null) {
            throw new Exception("Titular já Cadastrado.");
        }

        this.contas.add(c);
        contaMap.put(c.getTitular(), c);
    }

    public Conta pega(int x) {
        return this.contas.get(x);
    }

    public int pegaQuantidadeDeContas() {
        return this.contas.size();
    }

    public Conta buscaPorTitular(String nome) {
        return contaMap.get(nome);
    }

    public void mostraContas() {
        for (int i = 0; i < this.contas.size(); i++) {
            Conta conta = this.contas.get(i);
            System.out.println("Conta na posição " + i);
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Conta: " + conta.getNumero());
            System.out.println("");
        }
    }
}