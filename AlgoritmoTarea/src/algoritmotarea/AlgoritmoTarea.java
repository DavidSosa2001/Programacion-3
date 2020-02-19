
package algoritmotarea;
import java.util.Scanner;
public class AlgoritmoTarea {

    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        Velas res = new Velas();
        int edad;
        System.out.println("David Santiago Sosa 1803622");
        System.out.println("Programa que calcula el numero de velas que se apagan en un pastel de cumpleaños");
        System.out.println("Ingrese la edad del cumpleañero");
        edad = entrada.nextInt();
        res.setnvelas(edad);
        res.valt();
        res.vpan();
        res.vapag();
    }
    
}
