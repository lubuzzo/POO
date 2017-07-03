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
public interface contaInterfaciada {   
    public double getSaldo();
    public boolean deposita(double valor);
    public boolean saca(double valor);
    public double atualiza(double taxaSelic);
}
