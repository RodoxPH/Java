/**
 *  Autor: Rodolpho Nunes da Silva Rodrigues
 *  Sistema: Operações matemáticas com chamada de métodos 
 */
package aula12;

import java.util.Scanner;

public class Aula12 {

    public static void main(String[] args) {

        int num1, num2, soma, sub, mult;

        float div;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        num1 = s.nextInt();
        System.out.println("Informe o segundo número");
        num2 = s.nextInt();

        //chamada de métodos
        
        somar(num1, num2);//chama método soma

        multiplicar(num1, num2);//chamada método multiplicação

        sub = subtracao(num1, num2);//chamada método subtração
        System.out.println("A subtração é: " + sub);//output método subtração

        div = divisao(num1, num2);//chamada método divisão
        System.out.println("A divisão é: " + div);//output método divisão

    }

    //declaração de métodos
    //método sem retorno - soma
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
