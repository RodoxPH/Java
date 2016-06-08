/**
 *  Autor: Rodolpho Nunes da Silva Rodrigues
 *  Sistema: Operações matemáticas 
 */
package aula04;
import java.util.Scanner;

public class aula04 {

//calculadora simples
    public static void main(String[] args) {
        
        int num1,num2,soma,sub,mult;
        float div;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número");
        num1 = s.nextInt();
        System.out.println("Informe o segundo número");
        num2 = s.nextInt();
        
        soma = num1+num2;
        System.out.println("A soma é: "+soma);
 
        sub = num1 - num2;
        System.out.println("A subtração é: "+sub);
 
        mult = num1 * num2;
        System.out.println("A multiplicação é: "+mult);
        
        div = (float) num1 / num2;
        System.out.println("A divisão é: "+div);
        
    }
    
}
