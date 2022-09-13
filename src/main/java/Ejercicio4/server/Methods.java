package Ejercicio4.server;
//Morellano Alvarez Alejandro 4A DSM

import java.util.Arrays;
import java.util.Scanner;

public class Methods {

    public String numero(int num, int num2, int  num3, int num4, int num5){

        Scanner input = new Scanner(System.in);

        int numero[] = {num, num2, num3, num4, num5};
        Arrays.sort(numero);
        for (int i = num; i < numero.length; i++){
            System.out.println("numero: "+numero[i]);
        }

        System.out.println("numeros ascendentes");


        return (""+numero[0]+"-"+numero[1]+"-"+numero[2]+"-"+numero[3]+"-"+numero[4]);
    }

}
