package semana2proyectojava;

public class Semana2ProyectoJava {

    public static void main(String[] args) {
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
    }
    public static void metodoConVoid() {
        System.out.println("Contenido del metodo con void");
    }
    
    public static int metodoConInt(){
        System.out.println("Conternido del metodo con int");
        return 0;
    }
    
    public static double metodoConDouble(){
        System.out.println("Contenido del metodo con double");
        return 0.0;
    }
    
    public static String metodoConString(){
        System.out.println("Contenido del metodo");
        return "";
    }
}
