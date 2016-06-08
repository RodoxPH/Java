/**
 *  Autor: Rodolpho Nunes da Silva Rodrigues
 *  Sistema: Operações matemáticas com chamada de métodos estrangeiros
 */
package aula13;

import java.util.Scanner;

public class Aula13 {

    public static void main(String[] args) {

        int num1, num2, sub;

        float div;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        num1 = s.nextInt();
        System.out.println("Informe o segundo número");
        num2 = s.nextInt();

        //chamada de métodos
        Operacoes.somar(num1, num2);

        Operacoes.multiplicar(num1, num2);

        div = Operacoes.divisao(num1, num2);
        System.out.println("A divisão é: " + div);

        sub = Operacoes.subtracao(num1, num2);
        System.out.println("A subtração é: " + sub);
    }

}
