
package QQSM;

import java.io.*;
import java.util.*;

public class Questao_QQSM{
		
	int i;
	String line, name;
	ArrayList <String> Questions = new ArrayList <String>();
	
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
	
	
	public void printLevel1Questions(){
		for(i=0;i<Questions.size();i++){
		}
	}
}
