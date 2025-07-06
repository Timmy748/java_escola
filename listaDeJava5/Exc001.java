import java.util.Scanner;

public class Exc001 {
    //  1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Digite um número: ");
            numbers[i] = scan.nextInt();
        }

        for(int number: numbers){
            System.out.println(number);
        }
        scan.close();
    }
}