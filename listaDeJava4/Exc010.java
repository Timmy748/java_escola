import java.util.Scanner;

public class Exc010 {
    // 10. Faça um programa que receba dois números inteiros e gere os números inteiros
    //     que estão no intervalo compreendido por eles.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = scan.nextInt();
        for(int i = (numero1 + 1); i < numero2; i++){
            System.out.printf("%d ",i);
        }
        scan.close();
    }
}
