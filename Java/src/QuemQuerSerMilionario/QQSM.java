
package QuemQuerSerMilionario;

import java.util.Scanner;
import java.util.ArrayList;

public class QQSM {
    
    int i;
    
    ArrayList<String> Jogadores = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    
    public QQSM(){
    
    System.out.println("Bem vindo ao jogo Quem Quer Ser Milionário");    
        
    }
    
    
    //Regista o jogador
    public void registarJogador(){
        System.out.println("Introduza o nome do jogador a registar: ");
        String nomeJogador = input.nextLine();
        Jogadores.add(nomeJogador);
    }
    
    
    public void imprimirArrayList(){
        for(i=0;i<Jogadores.size();i++){
            System.out.println(Jogadores.get(i));
        }
    }
    
    
    
    public void main(String[] args){
        
        registarJogador();
        imprimirArrayList();
        
    }

    
}
