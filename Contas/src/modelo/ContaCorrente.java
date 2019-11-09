package modelo;

public class ContaCorrente extends Conta  implements Tributavel{

    @Override
    public void saca(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Você tentou sacar um valor negativo.");
        }

        if(this.getSaldo() < valor){
            throw new SaldoInsuficienteException(valor);
        }

        this.setSaldo(this.getSaldo() - (valor + 0.10)) ;
    }

    public String getTipo(){
        return "Conta Corrente";
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
