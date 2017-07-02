/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

/**
 *
 * @author sahudy
 */
public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    public Cliente titular; // = new Cliente();
    
    public Conta(Cliente novoCliente) {
        this.titular = novoCliente;
    }
    
    public Conta(Cliente novoCliente, int numero) {
        this.numero = numero;
        this.titular = novoCliente;
    }
    
    public boolean saca (double valor) {
        if ((this.saldo + this.limite) >= valor){
            this.saldo-=valor;
            return true;
        } else return false;
    }
    
    public boolean deposita (double valor) {
        if (valor > 0) {
            this.saldo+=valor;
            return true;
        } else return false;
    }

        
    public boolean transfere (Conta destino, double valor) {
        if (this.saldo >= valor) {
            destino.deposita(valor);
            this.saca(valor);
            return true;
        } else return false;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public String getTitular() {
        return this.titular.getNome();
    }

}
