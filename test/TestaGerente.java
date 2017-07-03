
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
public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        
        gerente.setNome("João da Silva");
        gerente.setSenha(1234);
        funcionario.setSalario(5000.0);
        
        System.out.println("Bonificacao do Funcionário: " + funcionario.getBonificacao());
        System.out.println("Bonificacao do Funcionário: " + gerente.getBonificacao());
    }
}
