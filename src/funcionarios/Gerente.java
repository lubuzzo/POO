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
public class Gerente extends Funcionario {
    int Senha;

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }
    
    public double getBonificacao() {
        return this.salario * 0.15;
    }
    
    public boolean autentica(int senha) {
        if (this.Senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }
    }
}
