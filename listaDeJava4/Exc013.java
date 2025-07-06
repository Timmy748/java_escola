import java.util.Scanner;

public class Exc013 {
    //  13. Faça um programa que peça dois números, base e expoente, calcule e mostre
    //     o primeiro número elevado ao segundo número. Não utilize a função de potência
    //     da linguagem.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a base");
        int base = scan.nextInt();
        System.out.println("Digite o expoente");
        int expoente = scan.nextInt();
        int result = base;
        for(int i = 0; i < (expoente - 1);i++) result *= base;
        System.out.println(result);
        scan.close();
    }
}
