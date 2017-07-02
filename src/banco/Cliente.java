/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

/**
 *
 * @author sahudy
 */
public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    
    public String getNome() {
        return this.nome;
    }
    
    public Cliente(String nome) {
        this.nome = nome;
        this.endereco = "";
        this.cpf = "000.000.000-00";
    }
    
    public Cliente(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }
    
}
