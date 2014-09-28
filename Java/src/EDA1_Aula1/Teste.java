/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDA1_Aula1;

import java.util.*;

public class Teste {

    public static void main(String[] args){
        
        Stack pilha = new Stack();
        
        Peca pecaInsere = new Peca();
        pilha.push(pecaInsere);
        
        Peca pecaRemove = new Peca();
        pilha.pop(pecaRemove);
        
        if(pilha.empty()){
            System.out.println("PILHA VAZIA");
        }
        
    }
    
}
