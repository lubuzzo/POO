/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaciado;

import bancoInterfaciado.ContaCorrenteInterfaciada;
import bancoInterfaciado.ContaPoupancaInterfaciada;
import bancoInterfaciado.TributavelInterfaciado;

/**
 *
 * @author buzzo
 */
public class TestaInterfaciado {
    public static void main(String[] args) {
        ContaCorrenteInterfaciada cc = new ContaCorrenteInterfaciada();
        //Só possui construtor passando uma string (nome) como parâmetro
        
        cc.deposita(100);
        TributavelInterfaciado t = cc;
        System.out.println(t.calcularTributos());
        cc.atualiza(0.01);
        System.out.println("Saldo da CC: " + cc.getSaldo());
        
        ContaPoupancaInterfaciada cp = new ContaPoupancaInterfaciada();
        //Só possui construtor passando uma string (nome) como parâmetro
        
        cp.deposita(100);
        /*  
            TributavelInterfaciado t = cp;
            CP não é tributável
        */
        cp.atualiza(0.01);
        System.out.println("Saldo da CP: " + cp.getSaldo());
        
        /*
        System.err.println(t.getSaldo());
        Não implementando (vide diagrama de classes)
        */        
    }
}
