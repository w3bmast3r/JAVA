
import java.util.*;
import javax.swing.*;

public class Binary_Number {
    
    int i;
    Integer integerNumber;
    
    ArrayList <Integer> integerArrayList = new ArrayList <Integer> ();
    ArrayList <Integer> booleanArrayList = new ArrayList <Integer> ();
    
    Scanner sC = new Scanner(System.in);
    
    
    public Binary_Number(int integerNumber){

        this.integerNumber = integerNumber;
        
    }
    
    
    public void convertInteger(){
        
        System.out.println("Introduza o número inteiro:");
        integerNumber = sC.nextInt();
        
        while((integerNumber/2)>0){
            integerArrayList.add(integerNumber/2);
            booleanArrayList.add(integerNumber%2);
            }
        }
    
    public void printbooleanArrayList(){
        for(int i=0; i<booleanArrayList.size();i++){
            System.out.println(booleanArrayList.get(i));
        }
    }
    
    public static void main (String[] args){
        
       Binary_Number b1 = new Binary_Number(123);
       b1.convertInteger();
       b1.printbooleanArrayList();
       
        
    }
    
}
