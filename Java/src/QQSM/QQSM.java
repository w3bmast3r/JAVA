
package QQSM;

import java.io.*;
import java.util.*;
	

public class QQSM{

    public static void main(String[] args) throws FileNotFoundException {
			
	Questao_QQSM T2 = new Questao_QQSM();
        T2.readFile();
        T2.organizeQuestions();
        T2.test();
			
    }
		
}	