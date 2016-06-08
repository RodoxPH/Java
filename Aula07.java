/**
 *  Autor: Rodolpho Nunes da Silva Rodrigues
 *  Sistema: Switch case
 */
package aula07;

import java.util.Scanner;

public class Aula07 {

    public static void main(String[] args) {

        int numero;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número inteiro de 1 até 10");
        numero = s.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;
            case 8:
                System.out.println("Oito");
                break;
            case 9:
                System.out.println("Nove");
                break;
            case 10:
                System.out.println("Dez");
                break;
        }
    }

}
