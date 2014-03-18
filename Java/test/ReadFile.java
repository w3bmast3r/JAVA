


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadFile {
    
    public static void main(String[] args){
            
    Scanner sC = new Scanner(System.in);
    
    System.out.printf("Informe o nome de arquivo texto:\n");
    String fileName = sC.nextLine();
    
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
        FileReader textFile = new FileReader(fileName);
        BufferedReader readFile = new BufferedReader(textFile);
        
        String line = readFile.readLine();
        
        while(line != null){
            System.out.printf("%s\n", line);
            line = readFile.readLine();
            
        }
        
        textFile.close();
        
    }
    catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
                e.getMessage());
    }
         System.out.println();
        
    }
    
}
