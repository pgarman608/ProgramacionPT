public class prueba {
    public static void main(String[] args) {
        //Declaracion de variables
        int num1= 0;
        int num2= 0;
        //Solucion
        num1 = (int)(Math.random()*((100-1+1)+1));
        System.out.println(num1);
        ejercicio2.espacear();
        num2 = ejercicio2.voltear(num1);
        System.out.println(num2);
        ejercicio2.espacear();
        boolean primo = ejercicio2.esPrimo(num1);
    }
}
