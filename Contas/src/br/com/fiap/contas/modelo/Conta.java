package br.com.fiap.contas.modelo;

public abstract class Conta implements Comparable<Conta> {
    private String titular;
    private double saldo;
    private String agencia;
    private int numero;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void deposita(double valor) {
        if (valor < 0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo.");
        }
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta conta) {
        this.saca(valor);
        conta.deposita(valor);
    }

    public abstract String getTipo();

    @Override
    public String toString(){
        return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "Saldo=" + saldo + "]";
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;

        Conta outraConta = (Conta) obj;
        return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
    }

    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }
}