/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * @author buzzo
 */
public class SecretarioAgencia extends Secretario {
    
    public double getBonificacao() {
        return this.salario * 0.05;
    }    
    
}
