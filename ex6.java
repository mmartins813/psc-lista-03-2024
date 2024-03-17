import java.util.Random;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int n1, n2, nrandom, maior, menorn;

        System.out.println("Insira o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Insira o segundo número: ");
        n2 = input.nextInt();
        input.close();
        if (n1>n2){
            nrandom = random.nextInt(n2,n1);
        } else{
            nrandom = random.nextInt();
        }
        if(nrandom % 2 == 0){
            System.out.printf("O número %d é par",nrandom);
        }
        if(nrandom % 2 == 1){
            System.out.printf("O número %d é impar", nrandom);
        }

    }
}
