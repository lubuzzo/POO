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
public class Presidente extends Gerente {

    @Override
    public double getBonificacao() {
        return (super.getBonificacao() + 1000);
        
    }
    
    
    
}
