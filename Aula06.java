/**
 *  Autor: Rodolpho Nunes da Silva Rodrigues
 *  Sistema: Comparações de números
 */
package aula06;
import java.util.Scanner;

public class Aula06 {


    public static void main(String[] args) {
        
        int num1,num2,soma;
               
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número");
        num1 = s.nextInt();
        
        System.out.println("Informe o segundo número");
        num2 = s.nextInt();
        
        soma = num1+num2;
                
        if(soma > 10){
            System.out.println("A soma é maior que 10 \nO resultado é: "+soma);
        }
        
        else if(soma == 10){
            System.out.println("A soma é igual a 10 \nO resultado é: "+soma);
        }
        
        else {
            System.out.println("A soma é menor que 10 \nO resultado é: "+soma);
        }
        
    }
    
}