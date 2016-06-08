/**
 *  Autor: Rodolpho Nunes da Silva Rodrigues
 *  Sistema: Inserção de char e String 
 */
package aula11;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aula11 {

    public static void main(String[] args) {
        //leitura char
        char letra = 0;

        System.out.println("Digite uma tecla");

        try {
            letra = (char) System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Aula11.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("A tecla digitada foi:" + letra);

        //leitura string
        String palavra;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe uma palavra");

        palavra = s.nextLine();

        System.out.println("A palavra digitada é:" + palavra);

    }

}
