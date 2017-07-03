/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoInterfaciado;

/**
 *
 * @author buzzo
 */
public class ContaPoupancaInterfaciada extends ContaInterfaciada {
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    
    
    
    @Override
    public double getSaldo() {
        return this.saldo;
    }
    
    @Override
    public boolean deposita(double valor) {
        if (valor > 0) {
            setSaldo((getSaldo() + valor) - 0.1);
            return true;
        } 
        return false;
    }

    @Override
    public boolean saca(double valor) {
        if ((getSaldo() + getLimite()) >= valor){
            setSaldo(getSaldo()- valor);
            return true;
        } 
        return false;        
    }

    @Override
    public double atualiza(double taxaSelic) {
        setSaldo(getSaldo() * (1 + (2 * (taxaSelic))));
        return getSaldo();
    }   
}
