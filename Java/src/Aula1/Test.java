
package Aula1;

import java.util.*;

public class Test{

public static void main(String[] args) {
    /*
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduza o número de alunos a introduzir");
    int n = sc.nextInt();
    
    String nomes [] = new String[n];
    int idades [] = new int[n];
    int matriculas[] = new int[n];
    
    for(int i=0 ; i < n ; i++){
        System.out.println("Nome do aluno "+(i+1));
        String nome = sc.next();
        nome=nomes[i];
        
        System.out.println("Idade do aluno "+(i+1));
        int idade = sc.nextInt();
        idade = idades[i];
        
        System.out.println("Número de matriculas do aluno "+(i+1));
        int matricula = sc.nextInt();
        matricula = matriculas[i];
    }
    */
    
    Registo r1 = new Registo();
    r1.askandfillArray();
    }

}
