package Toshi;


import java.io.*;

public class Toshi {
    
    
    public void readFile(){
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("teste.txt"));
            
            while (reader.ready()){
                String linha = reader.readLine();
                System.out.println(linha);
            }
            reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    /*
    FileReader fileR;
    BufferedReader buffR;
    FileWriter fileW;
    BufferedWriter buffW;
    
    public void Toshi(){
        
    }
    
    public void verificarString(){
        
    }
    
    public void readFile() throws FileNotFoundException, IOException{
        
        try {
            fileR = new FileReader("teste.txt");
            buffR = new BufferedReader(fileR);
            while(buffR.ready()){
                System.out.println(buffR.readLine());
            }
            
            buffR.close();
            
        }
        
        catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        
        catch (IOException er){
            System.out.println("IOException");
        }
    }
    
        
     public void writeFile() throws IOException{
         
         File archive = new File ("/home/Bruno/output.txt");
         
         try{
             
             if(!archive.exists()) {
                 archive.createNewFile();
             }
             
             FileWriter fileW = new FileWriter(archive, true);
             BufferedWriter buffW = new BufferedWriter(fileW);
             
             buffW.write("O David é panuca");
             
             buffW.close();
             fileW.close();
         
        }
        
        catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        
        catch (IOException er){
            System.out.println("IOException");
        }
        
        
    }
     
     */
    
    public static void main(String[] args){
        
        
        
    }
    
}