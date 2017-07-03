
import banco.Cliente;
import banco.ContaCorrente;
import banco.Tributavel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author buzzo
 */
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(new Cliente("Lucas Buzzo"));
        //Só possui construtor passando uma string (nome) como parâmetro
        
        cc.deposita(100);
        Tributavel t = cc;
        System.out.println(t.calcularTributos());
        
        /*
        System.err.println(t.getSaldo());
        Não implementando (vide diagrama de classes)
        */
        
    }
}
