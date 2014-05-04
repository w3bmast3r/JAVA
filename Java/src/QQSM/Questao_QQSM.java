
package QQSM;

import java.io.*;
import java.util.*;

public class Questao_QQSM{
	
	int i, level;
	String line, name, finalLevel;
	ArrayList <String> Questions = new ArrayList <String>();
	
	ArrayList <String> Ql1 = new ArrayList <String>();
	ArrayList <String> Ql2 = new ArrayList <String>();
	ArrayList <String> Ql3 = new ArrayList <String>();
	
	Scanner sC = new Scanner(System.in);
	
	
	//LER FICHEIRO > ALQUESTIONS
	public void readFile() throws FileNotFoundException{
		
		Scanner in = new Scanner(new FileReader("/home/bruno/workspace/P2/src/QQSM/perguntas.txt"));
		
		while (in.hasNextLine()){
		    line = in.nextLine();
		    Questions.add(i, line);
		    i++;
		}
		
	}
	
	//RETURN ALL LINES
	public void printALQuestions(){
		for(i=0;i<Questions.size();i++){
			System.out.println(Questions.get(i));
		}
	}
	
	
	//PLAYER'S REGISTRATION
	public void asknamePlayer(){
		System.out.println("Qual o nome do concorrente?");
		name = sC.nextLine();
	}
	
	//Tipos de Questões
	public void organizeQuestions(){
		for(i=0;i<5;i++){
			level = 8*i;
			finalLevel = Questions.get(level);
			if(finalLevel != "2" || finalLevel != "3"){
				for(i=0;i<5;i++){
					Ql1.add(Questions.get(i+1));
				}
			}
			if(finalLevel != "1" || finalLevel != "3"){
				for(i=0;i<5;i++){
					Ql2.add(Questions.get(i+1));
				}
			}
			if(finalLevel != "1" || finalLevel != "2"){
				for(i=0;i<5;i++){
					Ql3.add(Questions.get(i+1));
				}
			}
		}
	}
	
	public void test(){
		for(i=0;i<Ql3.size();i++){
			System.out.println(Ql3.get(i));
		}
	}
	
}

	
