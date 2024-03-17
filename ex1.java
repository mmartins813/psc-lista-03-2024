/*1. Escreva um algoritmo que leia 3 números a partir do teclado. O algoritmo deve apresentar:
        a. O maior número.
        b. O menor número.
        c. A média aritmética dos três números.*/
import java.util.Scanner;
public class ex1 {


    public static void main(String[] args) {
        double num1, num2, num3, media;
        Scanner input = new Scanner(System.in);
    //Leitura de dados através de scanner e uso de Math.max/min LOCAIS para definição de números maiores e menores.
        System.out.println("Insira o primeiro número: ");
        num1 = input.nextDouble();
        System.out.println("Insira o segundo número: ");
        num2 = input.nextDouble();
        System.out.println("Insira o terceiro número: ");
        num3 = input.nextDouble();
        media = (num1+num2+num3) / 3;
        double nmaior = Math.max(num1,Math.max(num2,num3));
        double nmenor = Math.min(num1,Math.min(num2,num3));


    //Saída de dados.
        System.out.printf("O maior número é: %.0f.", nmaior);
        System.out.printf("\nO menor número é: %.0f.",nmenor);
        System.out.printf("\nA média entre eles é de: %.0f",media);

    }
}
