/**
 *  Autor: Rodolpho Nunes da Silva Rodrigues
 *  Sistema: Operações matemáticas com chamada de métodos estrangeiros
 */
package aula13;

import java.util.Scanner;

public class Operacoes {

    static int num1;

    public static void somar(int num1, int num2) {
        int soma;
        soma = num1 + num2;
        System.out.println("A soma é: " + soma);
    }

    //método com retorno - subtração
    public static int subtracao(int num1, int num2) {
        int sub;
        sub = num1 - num2;
        return sub;
    }

    //método sem retorno - multiplicação
    public static void multiplicar(int num1, int num2) {
        int mult;
        mult = num1 * num2;
        System.out.println("A multiplicação é: " + mult);
    }

    //método com retorno - divisão
    public static float divisao(int num1, int num2) {
        float div;
        div = (float) num1 / num2;
        return div;
    }

}
