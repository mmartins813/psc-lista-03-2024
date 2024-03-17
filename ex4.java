import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, v, a, per;
        final double pi = Math.PI;
        int opt;
        System.out.println("Insira o valor do raio: ");
        r = input.nextDouble();

        System.out.println("Escolha a opção: \n" +
                "1-Perímetro do circulo\n" +
                "2-Área do círculo\n" +
                "3-Volume da esfera\n" +
                "Seleção: ");
        opt = input.nextInt();
        input.close();
        switch(opt){
            case 1:
                per = 2 * pi * r;
                System.out.printf("Perimetro do circulo é igual a: %2f", per);
                break;
            case 2:
                a = pi * r * r;
                System.out.printf("A Área do círculo é igual a: %2f", a);
                break;
            case 3:
                v = (4 * pi * Math.pow(r, 3)) / 3;
                System.out.printf("O volume do círculo é %.2f", v);
                break;
            default:
                System.out.println("Está opção é inválida.");
                break;
        }

    }
}
