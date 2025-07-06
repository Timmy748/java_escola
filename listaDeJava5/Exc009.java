import java.util.Scanner;

public class Exc009 {
    // 9. Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        int soma = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Digite um número: ");
            numbers[i] = scan.nextInt();
            soma += numbers[i] * numbers[i];
        }
        System.out.println(soma);
        scan.close();
    }
}
