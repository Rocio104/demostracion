/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2proyectojava;

public class MetodosConParametros {
    public static void main(String[] args) {
           System.out.println("Metodo void");
        metodoConParametroVoid(1,24.34,"Lucas");
        System.out.println("----------------");
        System.out.println("Metodo int");
        metodoConParametroInt(1);
        System.out.println("----------------");
        metodoConparametroDouble(24.34);
        System.out.println("----------------");
        System.out.println("Metodo String");
        metodoConParametroString("Lucas");
    }
    
    public static void metodoConParametroVoid(int valorInt, double valorDouble, String valorString){
        System.out.println("Valor int : "+ valorInt);
        System.out.println("Valor double : " +valorDouble);
        System.out.println("Valor String : " + valorString);
    }
    
    public static int metodoConParametroInt(int valorInt){
        System.out.println("El valor int es : " + valorInt);
        return valorInt;
    }
    
    public static double metodoConparametroDouble(double valorDouble){
        System.out.println("El valor double es : " + valorDouble);
        return valorDouble;
    }
    
    public static String metodoConParametroString(String valorString){
        System.out.println("El valor string es :" + valorString);
        return valorString;
    }
}
}
