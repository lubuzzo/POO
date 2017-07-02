/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author sahudy
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Insira o nome do banco: ");
        Scanner reader = new Scanner(System.in);
        String nomeBanco = reader.next();
        
        System.out.println("Insira a quantidade de contas do " + nomeBanco + ": ");
        int qtdeContas = reader.nextInt();
         
        banco.Banco bancoCriado = new banco.Banco(nomeBanco, qtdeContas);
 
        
        
        for (int Count = 0; Count < qtdeContas; Count++) {
            System.out.println("Insira o nome do Cliente: ");
            String nomeCliente = reader.next();
            Conta c1 = new Conta(new Cliente(nomeCliente));
            
            System.out.println("Insira o saldo inicial para depositar: ");
            double saldoCliente = reader.nextDouble();
            c1.deposita(saldoCliente);
            
            bancoCriado.inserirConta(c1);
            System.out.println("\n");
        }
        
        for (int Count = 0; Count < qtdeContas; Count++) {
            System.out.println(bancoCriado.nomeBanco() + "["+Count+"] == Cliente: " + bancoCriado.contas[Count].titular.getNome() + " tem: R$ " + bancoCriado.contas[Count].getSaldo());
        }
    }
    
}
