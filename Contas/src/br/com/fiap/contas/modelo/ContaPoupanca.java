package br.com.fiap.contas.modelo;

/**
 * Representa uma conta poupança não tributável.
 */
public class ContaPoupanca extends Conta {
    public String getTipo(){
        return "Conta Poupança";
    }

}
