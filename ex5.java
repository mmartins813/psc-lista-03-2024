import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1, n2;
        double pow;
        String opt;

        System.out.println("Insira o primeiro número: ");
        n1 = input.nextFloat();

        System.out.println("Insira o segundo número: ");
        n2 = input.nextFloat();

        System.out.println("Insira a operação desejada(+ , - , * , / ou ^): ");
        opt = input.next();


        switch (opt){
            case "+":
                System.out.printf("Soma do número %.0f e %.0f é:%.0f",n1, n2, n1 + n2);
                break;
            case "-":
                System.out.printf("Subtração do número %.0f e %.0f é: %.0f", n1,n2,n1-n2);
                break;
            case"*":
                System.out.printf("A multiplicação entre %.0f e %.0f é igual a %.0f",n1,n2,n1*n2);
                break;
            case"/":
                System.out.printf("A divisão entre %.0f e %.0f é iguaal a: %.0f",n1,n2,n1/n2);
                break;
            case"^":
                pow = Math.pow(n1,n2);
                System.out.printf("%.0f elevado a %.0f é igual a %.0f", n1, n2, pow);
                break;
            default:
                System.out.println("Simbolo operacional inválido");
                break;

        }
        System.out.println("\nPrograma Finalizado");
        input.close();
    }
}
