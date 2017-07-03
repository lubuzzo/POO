/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

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
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        
        Conta c1 = null;
        
        for (int Count = 0; Count < qtdeContas; Count++) {
            String tipoConta = "0";
            do {
            System.out.println("Deseja criar uma conta corrente ou poupança? (1 para CC, 2 para CP)");
            tipoConta = reader.next();
            } while (!(tipoConta.equals("1") || tipoConta.equals("2")));
            
            System.out.println("Insira o nome do Cliente: ");
            String nomeCliente = reader.next();
            
            if (tipoConta.equals("1")) {
                c1 = new ContaCorrente(new Cliente(nomeCliente));
            } else if (tipoConta.equals("2")) {
                c1 = new ContaPoupanca(new Cliente(nomeCliente));
            }
            
            if (!(bancoCriado.adicionarConta(c1))) {
             System.out.println("Ocorreu um erro ao inserir a conta, talvez o array esteja cheio!");
            } else {
                System.out.println("Insira o saldo inicial para depositar: ");
                double saldoCliente = reader.nextDouble();
                c1.deposita(saldoCliente);

                adc.roda(c1);                
            }
            
            System.out.println("\n");
        }
        
        bancoCriado.mostrarContas();
        
        System.out.println("Saldo total do " + bancoCriado.nomeBanco() + " é: R$ " + adc.getSaldoTotal());
        
        System.out.println("\nPesquisando pela conta número: " + c1.getNumero());
        if (bancoCriado.contem(c1)) {
            Conta contaExiste = bancoCriado.pegaConta(c1.getNumero());
            
            System.out.println("Conta encontrada!\n\tTitular: " + contaExiste.getTitular() + ",\n\tNúmero da conta: " + contaExiste.getNumero() + ",\n\tSaldo de: R$ " + contaExiste.getSaldo());
        } else {
            System.out.println("Conta pesquisada não encontrada!\n");
        }
    }
    
}
