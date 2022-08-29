package application;

import entities.Conta;

public class App {

    public static void main(String[] args) {
        Conta origem = new Conta("joao", "2a");
        Conta destino = new Conta("maria", "2b");
        origem.depositar(1000);
        origem.transferir(destino,200);


    }
}
