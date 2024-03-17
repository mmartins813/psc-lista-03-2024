import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.println("Informe os coeficientes da equação (ax^2 + bx + c).\n" +
                "Informe o coeficiente a:  \n");
        a = input.nextDouble();
        System.out.println("Informe o coeficiente b: \n");
        b = input.nextDouble();
        System.out.println("Informe o coeficiente c: \n");
        c = input.nextDouble();
        input.close();

        double delta = b*b-4*a*c;
        double raiz = Math.sqrt(delta);
        double x1 = (-b + Math.sqrt(delta)) / (2*a);
        double x2 = (-b - Math.sqrt(delta)) / (2*a);

        if (a == 0 && b == 0 && c != 0){
            System.out.println("Coeficientes errados");
        }
        else if (a == 0 && b != 0){
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("Raiz real da equação: " + raiz);
        }
        else if (delta<0){
            System.out.println("Esta equação não possui raízes reais.");
        }
        else if (delta==0){
            System.out.println("Esta equação possui duas raízes reais iguais. Sendo ela: "+ x1);
        }
        else if (delta>0){
            System.out.println("Possui duas raízes diferenes \n" +
                    "Sendo a primeira "+x1+"\nE a segunda"+x2);
        }

    }
}
