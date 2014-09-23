//PRIMEIRA AULA PRATICA

package P2_Aula1;

import java.util.*;
import javax.swing.*;

public class Chave {
/*
    Random randomNumber = new Random();
    int i, size=4, number;
    int[] Array = new int[4];
    
    public void gerarChave(){
        for(i=0;i<size;i++){
            number = randomNumber.nextInt(10);
            Array[i] = number;
        }
    }
    
    public void chaveInserida(int num1, int num2, int num3, int num4){
        int contador = 0;
            if(num1==Array[0]){
                contador++;
            }
            if(num2==Array[1]){
                contador++;
            }
            if(num3==Array[2]){
                contador++;
            }
            if(num4==Array[3]){
                contador++;
            }
            if(contador==1){
                System.out.println("Acertou um número");
            }
            else{
                System.out.println("Acertou em " + contador + " numeros");
            }
    }
    
    public void printArray(){
        for(i=0;i<size;i++){
            System.out.println(Array[i]);
        }
    }
    
    public static void main(String[] args){
        
        Chave c1 = new Chave();
        c1.gerarChave();
        c1.chaveInserida(1, 2, 3, 4);
        c1.printArray();
    }
  */
    
    Scanner sC = new Scanner(System.in);
    Random rN = new Random();
    
    int i, randomNumber, insertedNumber, size=4;
    String playerTip;
    
    ArrayList <String> alrandomKey = new ArrayList <String>();
    ArrayList <String> alplayerTip = new ArrayList <String>();
    
    public void randomKey(){
    
        for(i=0; i<size; i++){
            randomNumber = rN.nextInt(10);
            String randomString = Integer.toString(randomNumber);
            alrandomKey.add(randomString);
        }
        
    }
    
    public void playerTip(){
        
        for(i=0; i<size; i++){
            playerTip = JOptionPane.showInputDialog(null,"Introduza o Valor " + (i+1),"",JOptionPane.QUESTION_MESSAGE);
            alplayerTip.add(i, playerTip);
            
            //System.out.println("Introduza o valor " + (i+1));
            //insertedNumber = sC.nextInt();
            //alplayerTip.add(insertedNumber);
        }
    }
    
    public void verificationNumbers(){
        int counter = 0;
        for(i=0;i<size;i++){
            if(alrandomKey.get(i).equals(alplayerTip.get(i))){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("Não ganhou nada");
        }
        if(counter==1){
            System.out.println("Ganhou 100 Euros");
        }
        if(counter==2){
            System.out.println("Ganhou 200 Euros");
        }
        if(counter==3){
            System.out.println("Ganhou 300 Euros");
        }
        if(counter==4){
            System.out.println("Ganhou 400 Euros");
        }
    }
    
    
    public static void main(String[] args){
        Chave c1 = new Chave();
        c1.randomKey();
        c1.playerTip();
        c1.verificationNumbers();
    }
    
}
