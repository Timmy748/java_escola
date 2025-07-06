import java.util.Scanner;

public class Exc011 {
    //  11. Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        int[] vetorIntercalado = new int[30];

        System.out.println("Digite 10 números para o vetor 1:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scan.nextInt();
        }

        System.out.println("Digite 10 números para o vetor 2:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scan.nextInt();
        }

        System.out.println("Digite 10 números para o vetor 3:");
        for (int i = 0; i < 10; i++) {
            vetor3[i] = scan.nextInt();
        }

  
        for (int i = 0, j = 0; i < 10; i++) {
            vetorIntercalado[j++] = vetor1[i];
            vetorIntercalado[j++] = vetor2[i];
            vetorIntercalado[j++] = vetor3[i];
        }


        System.out.println("Vetor Intercalado:");
        for (int i = 0; i < 30; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }

        scan.close();
    }
}
