package Ejercicio3.server;
//Morellano Alvarez Alejandro 4A DSM

public class Methods {

    public int numeros(int num1, int num2){
        int suma = 0;
        int contador;
         for (contador = num1; contador <= num2; contador++){
             System.out.println("num:"+contador);
             System.out.println("");
             suma = suma + contador;
         }
         return suma;
    }

}
