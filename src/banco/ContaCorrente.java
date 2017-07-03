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
public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente(Cliente novoCliente) {
        super(novoCliente);
    }

    @Override
    public double atualizaTaxa (double taxa) {
        setSaldo(getSaldo() * (1 + (3 * (taxa))));
        return getSaldo();
    }    
    
    public boolean deposita (double valor) {
        if (valor > 0) {
            setSaldo((getSaldo() + valor) - 0.1);
            return true;
        } 
        return false;
    }

    @Override
    public double calcularTributos() {
        return this.getSaldo() * 0.01;
    }

}
