
package Aula2;

public class Nota {
    
    int value;
    String symbol;
    
    public void Nota(int value, String symbol){
    
        value = this.value;
        symbol = this.symbol;
        
}
    
    public void setValue(int value) {
        this.value = value;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
    
}
