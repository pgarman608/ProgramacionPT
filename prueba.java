import java.util.*;
public class prueba {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int num1= 0;
        int num2= 0;
        int sol = 0;
        //Solucion
        System.out.println("Introduceme la base");
        num1 = sc.nextInt();
        System.out.println("Introduceme el exponente");
        num2 = sc.nextInt();
        sol = ejercicio2.potencia(num1,num2);
    }
}
