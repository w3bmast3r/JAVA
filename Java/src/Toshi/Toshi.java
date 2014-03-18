package Toshi;


import java.io.*;

public class Toshi {
 
    
    FileReader fileR;
    BufferedReader buff;
 
    
    public void Toshi(){
        
    }
    
    public void readFile(){
        
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
    
    public static void main(String[] args){
        Toshi File = new Toshi();
        File.readFile();
    }
    
}