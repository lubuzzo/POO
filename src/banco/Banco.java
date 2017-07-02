/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

//import banco.Conta;


/**
 *
 * @author buzzo
 */
public class Banco {
    private String nome;
    public Conta[] contas;
    private int Qtde;
    
    
    public Banco(String nome, int Qtde) {
        this.Qtde = 0;
        this.nome = nome;
        this.contas = new Conta[Qtde];
    }
    
    public void inserirConta(Conta novaConta) {
        this.contas[this.Qtde] = novaConta;
        this.Qtde++;
    }
    
    public String nomeBanco() {
        return this.nome;
    }
    
    public void setNomeBanco(String Nome) {
        this.nome = Nome;
    }
    
    public String[] getTitulares() {
        String[] titulares;
        titulares = new String[this.contas.length];
        
        int Count = 0;
        for (; Count < this.contas.length; Count++) titulares[Count] = this.contas[Count].getTitular();
        
        return titulares;
        
    }
    
    public boolean contem(Conta c) {
        int Count = 0;
        boolean retorno = false;
        for (; Count < this.contas.length; Count++) {
            if (c == this.contas[Count]) retorno = true;
        }
        
        return retorno;
    }
}