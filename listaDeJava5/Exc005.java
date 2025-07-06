import java.util.Scanner;

public class Exc005 {
    //  5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
    //     números pares no vetor PAR e os números ÍMPARES no vetor ímpar. Imprima os três
    //     vetores.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int LENGTH = 20;
        int[] numbers = new int[LENGTH];
        int[] odd = new int[LENGTH];
        int[] even = new int[LENGTH];

        // seria melhor usar um arrayList, mas não posso
        for(int i = 0; i < LENGTH; i++){
            System.out.println("Digite um numero: ");
            numbers[i] = scan.nextInt();
            if(numbers[i] % 2 == 0){
                even[i] = numbers[i];

            } else{
                odd[i] = numbers[i];

            }

        }
        

        for(int i = 0; i < LENGTH; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("------IMPARES------");
        for(int i = 0; i < LENGTH; i++){
            System.out.println(odd[i]);
        }

        System.out.println("------PARES-----");
        for(int i = 0; i < LENGTH; i++){
            System.out.println(even[i]);
        }
        scan.close();
    }
}
