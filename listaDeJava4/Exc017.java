import java.util.Scanner;

public class Exc017 {
    //  17. Faça um programa que calcule o fatorial de um número inteiro
    //     fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero que voce  quer o fatorial");
        int num = scan.nextInt();
        long fatorial = 1;
        for(int i = 1; i <= num; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);
        scan.close();
    }
}
