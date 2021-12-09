import java.security.Signature;

public class ejercicio2{
    public static void esCapicuo(int[] array1, int numcajas) {
        int[] array2 = new int[numcajas];
        voltear(array1);    
        if (array1 == array2) {
            System.out.println("Tu numero es capicuo");
        } else {
            System.out.println("Tu numero no es capicuo");            
        }
    }    
    public static int voltear(int numero){
        int cifra, inverso = 0;
        while(numero!=0){
            cifra = numero%10;
            inverso = (inverso * 10) + cifra;
            numero/=10;
        }
        return inverso;
    }
    public static boolean esPrimo(int pnum1) {
        boolean primo = true;
        int contador = 2;
        while ((primo) && contador!=pnum1) {
            if (pnum1 % contador == 0 ) {
                primo = false;
            }
            contador++;
        }
        if (primo == false) {
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }
        return primo;
    }
    public static void espacear() {
        System.out.println("---------");
    }
    public static int () {
        
    }
}
