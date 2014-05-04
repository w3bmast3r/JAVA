package QQSM;




import java.io.*;
import java.util.*;

public class Questao_QQSM{
	
	private int i, c, level, finalCounter;
	private String line, name, finalLevel;
	
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
                    c=0;
                    level = 8*i;
                    finalLevel = Questions.get(level);
                    
                    if(finalLevel.equals("1")){
                        while(c<7){
                            finalCounter = level+c;
                            Ql1.add(Questions.get(finalCounter+1));
                            c++;
                        }
                    }
			if(finalLevel.equals("2")){
                            while(c<7){
                                finalCounter = level+c;
                                Ql2.add(Questions.get(finalCounter+1));
                                c++;
                            }
			}
			if(finalLevel.equals("3")){
                            while(c<7){
                                finalCounter = level+c;
                                Ql3.add(Questions.get(finalCounter+1));
                                c++;
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

	
