/* Programa simples que calcula e converte de celsius em >:
 Fahrenheit > Kelvin > Rankine > Réaumur */

import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

      Scanner input = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat(".0");
        
        double celsius=0, f, k, ra, re;   // Declaracão das variáveis das unidades de temperatura

            System.out.printf("-----------------------------------------------------------------------------------------------------");
            System.out.printf("\n>>>>>>>>>>>|| CONVERSOR DE TEMPERATURA EM CELSIUS PARA KELVIN, FAHRENHEIT, RANKINE E RÉAUMUR ||<<<<<\n");
            System.out.printf("-----------------------------------------------------------------------------------------------------");

            System.out.println ("\nDigite a temperatura em celsius:");

            celsius = input.nextDouble(); //entrada de valores do usuário

                f =(celsius * 9/5) + 32; k = celsius + 273.15; ra = (celsius * 9/5) + 491.67; re = celsius * 0.8;  // Pega as variáveis e une com as formulas para cheagar ao resultado

            System.out.println ("\nA temperauta em fahrenheit: "+ df.format(f)+"°");
            System.out.println ("\nA temperauta em Kelvin: "+ df.format(k)+"°");
            System.out.println ("\nA temperauta em Rankine: "+ df.format(ra)+"°");
            System.out.println ("\nA temperauta em Réaumur: "+ df.format(re)+"°" + "\n");
  }
}