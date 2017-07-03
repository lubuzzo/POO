/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author buzzo
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente novoCliente) {
        super(novoCliente);
    }
    
    public void atualizaTaxa (double taxa) {
        setSaldo(getSaldo() * 1 + (2 * (taxa)));
    }
    
}
