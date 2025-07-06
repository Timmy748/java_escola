import java.util.Scanner;
public class Exc007 {
    //  7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        long sum = 0;
        long multiplication = 1;

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Digite um numero: ");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
            multiplication *= numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.printf("soma: %d%n", sum);
        System.out.printf("multiplicacao: %d%n", multiplication);
        scan.close();
    }
}
