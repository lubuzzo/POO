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
            String tipoConta = "0";
            do {
            System.out.println("Deseja criar uma conta corrente ou poupança? (1 para CC, 2 para CP)");
            tipoConta = reader.next();
            } while (!(tipoConta.equals("1") || tipoConta.equals("2")));
            
            System.out.println("Insira o nome do Cliente: ");
            String nomeCliente = reader.next();
            
            Conta c1 = null;
            
            if (tipoConta.equals("1")) {
                c1 = new ContaCorrente(new Cliente(nomeCliente));
            } else if (tipoConta.equals("2")) {
                c1 = new ContaPoupanca(new Cliente(nomeCliente));
            }
            
            System.out.println("Insira o saldo inicial para depositar: ");
            double saldoCliente = reader.nextDouble();
            c1.deposita(saldoCliente);
            
            if (tipoConta.equals("1")) c1.atualizaTaxa(0.01);
            else if (tipoConta.equals("2")) c1.atualizaTaxa(0.01);
            
            if (!(bancoCriado.adicionarConta(c1))) {
             System.out.println("Ocorreu um erro ao inserir a conta, talvez o array esteja cheio!");
            }
            
            System.out.println("\n");
        }
        
        bancoCriado.mostrarContas();
        
    }
    
}
