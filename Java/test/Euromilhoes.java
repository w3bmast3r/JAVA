


import java.util.*;
import javax.swing.*;

public class Euromilhoes {

    int i, finalNumber;
    int size=4;
    
    ArrayList<Integer> ArrayList = new ArrayList();
    
    Random randomNumber = new Random(); 
    
public void randomNumbers(){
    
    for(i=0;i<size;i++){
        finalNumber = randomNumber.nextInt(10);
        ArrayList.add(finalNumber);
    }
}


public static void main(String[] args) {


}


}