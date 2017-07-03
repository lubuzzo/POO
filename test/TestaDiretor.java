
import funcionarios.Diretor;
import funcionarios.Funcionario;
import funcionarios.Gerente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author buzzo
 */
public class TestaDiretor {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        Funcionario funcionario = diretor;
        
        diretor.setNome("Diretor João da Silva");
        diretor.setSenha(1234);
        funcionario.setSalario(5000.0);
        
        System.out.println("Bonificacao do Funcionário: " + funcionario.getBonificacao());
        System.out.println("Bonificacao do Diretor: " + diretor.getBonificacao());
    }
    
}
