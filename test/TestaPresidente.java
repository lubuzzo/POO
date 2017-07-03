
import funcionarios.Funcionario;
import funcionarios.Presidente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author buzzo
 */
public class TestaPresidente {
    public static void main(String[] args) {
        Presidente presidente = new Presidente();
        Funcionario funcionario = presidente;
        
        presidente.setNome("Presidiário João da Silva");
        presidente.setSenha(1234);
        funcionario.setSalario(5000.0);
        
        System.out.println("Bonificacao do Funcionário: " + funcionario.getBonificacao());
        System.out.println("Bonificacao do Funcionário: " + presidente.getBonificacao());
    }    
}
