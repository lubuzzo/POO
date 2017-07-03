/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import java.util.Random;

/**
 *
 * @author sahudy
 */
public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    public Cliente titular; // = new Cliente();

    public String getTitular() {
        return titular.getNome();
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    private int generateNumber() {
        Random r = new Random();
        return (r.nextInt(10));
    }

    public int getNumero() {
        return numero;
    }

    public Conta(Cliente novoCliente) {
        this.numero = generateNumber();
        this.titular = novoCliente;
    }
    
    public Conta(Cliente novoCliente, int numero) {
        this.numero = numero;
        this.titular = novoCliente;
    }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean saca (double valor) {
        if ((getSaldo() + getLimite()) >= valor){
            setSaldo(getSaldo()- valor);
            return true;
        } 
        return false;
    }
    
    public boolean deposita (double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            return true;
        } 
        return false;
    }

        
    public boolean transfere (Conta destino, double valor) {
        if (getSaldo() >= valor) {
            destino.deposita(valor);
            this.saca(valor);
            return true;
        } 
        return false;
    }
    
    public double getSaldo() {
        return this.saldo;
    }

    public void atualizaTaxa (double taxa) {
        setSaldo(getSaldo() * 1 + (taxa));
    }
    
}
