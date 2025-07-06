import java.util.Scanner;

public class Exc010 {
    // 10. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro
    // vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados
    // dos dois outros vetores.
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorIntercalado = new int[20];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scan.nextInt();
        }

        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scan.nextInt();
        }


        for (int i = 0, j = 0; i < 10; i++) {
            vetorIntercalado[j++] = vetor1[i];
            vetorIntercalado[j++] = vetor2[i];
        }

        System.out.println("Vetor Intercalado:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
        
        scan.close();
    }
}
