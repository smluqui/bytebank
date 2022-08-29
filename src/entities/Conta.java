package entities;

public class Conta {

    // atributos

    public String nome;
    public String idConta;
    public double saldo;

    // construtores

    public Conta(String nome, String idConta) {
        this.nome = nome;
        this.idConta = idConta;
    }

    // metodos

    public boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    //  saldo +=valor  ;

    }

    public boolean sacar(double valor) {
       boolean teste = (saldo >= valor);
       if (teste) {
           saldo = saldo - valor;
           return true;
       }

       return false;

    }

    public boolean transferir(Conta contaDestino, double valor) {
        if (sacar(valor))  {
            return contaDestino.depositar(valor);
          }

        return false;

    }
}
