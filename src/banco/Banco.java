/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

//import banco.Conta;

import java.util.ArrayList;



/**
 *
 * @author buzzo
 */
public class Banco {
    private String nome;
    public ArrayList<Conta> contas;
    private int Qtde;
    
    
    public Banco(String nome, int Qtde) {
        this.Qtde = 0;
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }
    
    public boolean adicionarConta(Conta novaConta) {
        if (this.contas.add(novaConta)) {
            this.Qtde++;
            return true;
        }
        return false;
    }
    
    public void mostrarContas() {
        int count = 0;
        for (; count < this.Qtde; count++)
            System.out.println(this.nomeBanco() + "["+count+"] == Cliente: " + this.contas.get(count).getTitular() + " tem: R$ " + this.contas.get(count).getSaldo());
    }
    
    public String nomeBanco() {
        return this.nome;
    }
    
    public void setNomeBanco(String Nome) {
        this.nome = Nome;
    }
    
    public String[] getTitulares() {
        String[] titulares;
        titulares = new String[this.contas.size()];
        
        int Count = 0;
        for (; Count < this.contas.size(); Count++) titulares[Count] = this.contas.get(Count).getTitular();
        
        return titulares;
        
    }
    
    public boolean contem(Conta c) {
        boolean retorno = false;
        
        if (this.contas.indexOf(c) != -1) retorno = true;
        
        return retorno;
    }
    
    public Conta pegaConta(int idConta) {
        int Count = 0;
        for (; Count < this.contas.size(); Count++) {
            if (this.contas.get(Count).getNumero() == idConta) {
                return this.contas.get(Count);
            }
        }
        return null;
    }
    
    public double pegaTotalDeContas() {
        int Count = 0;
        double Total = 0;
        for (; Count < this.contas.size(); Count++) {
            Total+=this.contas.get(Count).getSaldo();
        }
        return Total;
    }
}
