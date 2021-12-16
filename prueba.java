import java.util.*;
public class prueba {
    public static void main(String[] args) {
        //Declaracion de variables
        boolean fin = false;
        //Solucion
        while(fin == false){
            int num1 = crearint(null);
            if (num1 < 0 || num1 > 3) {
                fin = true;
            }else{
                int filas = crearint("Introduceme el numero de filas de la matriz");
                int column = crearint("Introduceme el numero de columnas de la matriz");
                int[][] matriz = new int[filas][column];
                switch(num1){
                    case 0:
                    System.out.println("Adios");
                    fin = true;
                    break;
                    case 1:
                    //Sumar matriz
                    sumamatriz(matriz);
                    fin = true;
                    break;
                    case 2:
                    //Restar matriz
                    fin = true;
                    break;
                    case 3:
                    //Producto escalar
                    fin = true;
                    break;
                }
            }    
        }
    }
    public static int crearint(String msg){
        if (msg == null) {
            msg = "Introduce un numero";
        }
        Scanner sc = new Scanner(System.in);
        int pnum = 0;
        System.out.println(msg);
        pnum = sc.nextInt();
        return pnum;
    }
    public static void introNumMatriz(int[][] fmtz){
        for (int i = 0;i < fmtz.length ; i++) {
            for (int j = 0;j < fmtz[0].length; j++){
                fmtz[i][j] = crearint("Introduce el numero " + i + " fila " + j + " columna.");
            }
        }
    }
    public static void sumamatriz(int[][] fmtz){
        int numerosuma = crearint("Introduceme un numero para sumarla a la matriz");
        introNumMatriz(fmtz);
        for (int i = 0; i < fmtz.length ; i++ ) {
            for (int j = 0; j > fmtz[0].length; j++) {
            fmtz[i][j] = fmtz[i][j] + numerosuma;
            System.out.println("Fila " + i + " y columna " + j + " = " + fmtz[i][j]);
            }
        }
    }
}