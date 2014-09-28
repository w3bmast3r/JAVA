/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F2_CalcVect;

import java.lang.Math;

public class vectores {
    
    private int a1,a2,a3,b1,b2,b3;
    int coordenada, i;
    
    
    public vectores(){
        
    }
    
    public void  anguloVectores(a1, a2, a3, b1, b2, b3){
        
        //Produto Externo
        int peResult = a1*b1 + a2*b2 + a3*b3;
        
        //Modulos
        int modA = (int) Math.sqrt(Math.pow(a1,2) + Math.pow(a2,2) + Math.pow(a3,2));
        int modB = (int) Math.sqrt(Math.pow(b1,2) + Math.pow(b2,2) + Math.pow(b3,2));
        
        int modResult = modA*modB;
        
        double finalResult = peResult/modResult;
        
        System.out.println("RESULTADO FINAL: " + finalResult);
        
        System.out.println("Ângulo: " + Math.acos(finalResult));
        
    }
     
}
