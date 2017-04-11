
package calculator;

import javax.swing.JFrame;


public class Calculator {
    double x;
    double y;
    double z;
 
 public Calculator(){
     x=0;
     y=0;
     z=0;
 }
    
    public double Soma(double x, double y){
    z = x + y;
    return z;
}
    public double Subtracao(double x, double y){
    z = x - y;
    return z;
}
    public double Multiplicacao(double x, double y){
    z = x*y;
    return z;
}
    public double Divisao(double x,double y){
    z= x/z;
    return z;
}
    public static void main(String[] args) {
        JFrame janela = new TelaCalculadora();
        janela.setVisible(true);
    }
}   
