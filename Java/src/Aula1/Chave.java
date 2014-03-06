//PRIMEIRA AULA PRATICA

package Aula1;

import java.util.*;

public class Chave {

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
    
}
