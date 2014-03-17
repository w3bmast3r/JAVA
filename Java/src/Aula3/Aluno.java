
package Aula3;

import java.util.ArrayList;

public class Aluno {

    int i, counter=0, numeroAluno;
    String nomeAluno;
    
    ArrayList <String> nomeAlunoAL = new ArrayList <String>();
    
    public void Aluno(int numeroAluno, String nomeAluno){
    
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
    }
    
    public void fillArray(){
       
        
        for(i=0;i<nomeAluno.length();i++){
            nomeAlunoAL.add(nomeAluno);
        }
    }
    
    public void printArray(){
       
        
        for(i=0;i<nomeAlunoAL.size();i++){
            System.out.println(nomeAlunoAL.get(i));
        }
    }
    
    
    
    public String nome_proprio(){
        
        i=0;
        while(nomeAlunoAL.get(i) != " "){
            nomeAlunoAL.add(nomeAlunoAL.get(i));
        }
        
        return "";
    }
    
    
    private int conta_espacos(){
        for(i=0;i<nomeAlunoAL.size();i++){
            if(nomeAlunoAL.get(i)==" "){
                counter++;
            }
        }
        return counter;
    }
    
    
    
    
    
    
    
    
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    
    
    
    public static void main(String[] args){
        
        Aluno a1 = new Aluno();
        a1.setNomeAluno("Bruno Rafael Caetano Santos");
        a1.setNumeroAluno(29451);
        a1.fillArray();
        a1.printArray();
        
        
    }
    
}
