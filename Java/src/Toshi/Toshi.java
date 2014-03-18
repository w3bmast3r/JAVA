package Toshi;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Toshi {
 
    
    FileReader fileR;
    BufferedReader buff;
 
    
    public void Toshi(){
        
        try {
            fileR = new FileReader("teste.txt");
            buff = new BufferedReader(fileR);
            while(buff.ready()){
                System.out.println(buff.readLine());
            }
            
            buff.close();
            
        } 
        
        catch (FileNotFoundException ex){
            System.out.println("Ficheiro não encontrado");
        }
        
        catch (IOException er){
            System.out.println("IOException");
        }
        
        
    }
}