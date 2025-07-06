import java.util.Scanner;

public class Exc002 {
    //  2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];

            for(int i = 0; i < numbers.length; i++){
                System.out.println("Digite um numero: ");
                numbers[i] = scan.nextDouble();

            }

        for(int i = numbers.length - 1;  i >= 0; i--){
            System.out.println(numbers[i]);
        }

        scan.close();

    }
}
