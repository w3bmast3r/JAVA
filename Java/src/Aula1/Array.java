//PRIMEIRA AULA PRATICA

package Aula1;

import java.util.*;

public class Array {

    Scanner sc = new Scanner(System.in);
    
    int i;
    public int size, number,trueArraySize;
    
    ArrayList<Integer> ArrayList = new ArrayList<Integer>();
    int[] TrueArray = new int[trueArraySize];
    
    
    //Preencher ArrayList com os elementos dados
    public void askElements(){
        System.out.println("Quantos elementos terá o array?\n");
        size = sc.nextInt();
        trueArraySize = size;
        
        for(i=0;i<size;i++){
            System.out.println("Introduza o valor " + (i+1));
            number = sc.nextInt();
            ArrayList.add(number);
            
        }
    }
    
    
    //Imprime ArrayList
    public void printArrayList(){
       for(i=0;i<size;i++){
           System.out.println(ArrayList.get(i));
       }
    }
    
    
    public static void main(String[] args) {
        
        Array a1 = new Array();
        a1.askElements();
        a1.printArrayList();
        
    }
    
    
}
