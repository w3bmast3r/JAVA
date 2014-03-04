
package Aula1;

import java.util.*;

public class Registo {
    
private String nome;
private int idade;
private int matricula;
int n;

Scanner sc = new Scanner(System.in);

/*
public Registo (String nome, int idade, int matriculas){
    this.nome = nome;
    this.idade = idade;
    this.matricula = matriculas;
}
*/

public Registo(){
    
}

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void askandfillArray(){
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
        for(int i=0;i<n;i++){
        System.out.println(nomes[i]+idades[i]+matriculas[i]);
        }
        
    }
    
}