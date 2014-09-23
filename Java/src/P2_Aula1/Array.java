//PRIMEIRA AULA PRATICA

package P2_Aula1;

import java.util.*;

public class Array {

    Scanner sc = new Scanner(System.in);
    
    int i;
    public int size, number,counter=0;
    
    ArrayList<Integer> ArrayList = new ArrayList<Integer>();
    
    
    //Preencher ArrayList com os elementos dados
    public void askElements(){
        System.out.println("Quantos elementos terá o array?\n");
        size = sc.nextInt();
        if(size<1){
            System.out.println("Número inválido\n");
            askElements();
        }
        else{
        for(i=0;i<size;i++){
            System.out.println("Introduza o valor " + (i+1));
            number = sc.nextInt();
            ArrayList.add(number);
        }
        }
    }
    
    
    //Imprime ArrayList
    public void printArrayList(){
       for(i=0;i<size;i++){
           System.out.println(ArrayList.get(i));
       }
    }
    
    //Contar números pares
    public void pairCounter(){
        for(i=0;i<size;i++){
            if(ArrayList.get(i)%2==0){
                counter++;
            }
        }
        if(counter==1){
            System.out.println("Dos elementos dados introduziu " + counter + " número par");
        }
        else{
            System.out.println("Dos elementos dados introduziu " + counter + " números pares");
        }
    }
    
    
    //Retornar o menor número impar
    public void lessOddNumber(){
        int odd=1000;
        for(i=0;i<size;i++){
            if(ArrayList.get(i)%2!=0){
                if(ArrayList.get(i)<odd)
                    odd = ArrayList.get(i);
            }
                counter++;   
            }
        System.out.println("O menor número impar é: " + odd);
    }
    
    
    //Somar todos os números
    public void sumAllNumbers(){
        int sum = 0;
        for(i=0;i<size;i++){
            sum += ArrayList.get(i);
        }
        System.out.println("Soma total dos elementos: " + sum);
    }
    
    public void sumAllPositiveNumbers(){
        int sum = 0;
        for(i=0;i<size;i++){
            if(ArrayList.get(i)>0){
                sum += ArrayList.get(i);
            }
        }
        System.out.println("Soma total dos números positivos: " + sum);
    }
    
    
    
    public static void main(String[] args) {
        
        Array a1 = new Array();
        a1.askElements();
        a1.pairCounter();
        a1.sumAllNumbers();
        a1.sumAllPositiveNumbers();
        a1.lessOddNumber();
    }
    
    
}
