import java.util.Scanner;

public class Exc015 {
    //  15. Faça um programa que leia 10 valores, correspondentes a notas. Após esta entrada de
    //     dados, sem alterar o vetor original, faça:
    //     a. Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
    //     b. Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
    //     c. Calcule e mostre a soma dos valores;
    //     d. Calcule e mostre a média dos valores;
    //     e. Calcule e mostre a quantidade de valores acima da média calculada;
    //     f. Calcule e mostre a quantidade de valores abaixo de sete;
    //     g. Encerre o programa com uma mensagem;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int TOTAL = 10;
        double[] notas = new double[TOTAL];


        System.out.println("Digite 10 notas:");
        for (int i = 0; i < TOTAL; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scan.nextDouble();
        }


        System.out.println("\nNotas na ordem informada:");
        for (int i = 0; i < TOTAL; i++) {
            System.out.printf("%.2f ", notas[i]);
        }
        System.out.println();


        System.out.println("\nNotas na ordem inversa:");
        for (int i = TOTAL - 1; i >= 0; i--) {
            System.out.printf("%.2f\n", notas[i]);
        }

       
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / TOTAL;
        System.out.printf("\nSoma das notas: %.2f\n", soma);
        System.out.printf("Média das notas: %.2f\n", media);

        
        int contAcimaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                contAcimaMedia++;
            }
        }
        System.out.printf("Quantidade de notas acima da média: %d\n", contAcimaMedia);

        
        int contAbaixoSete = 0;
        for (double nota : notas) {
            if (nota < 7.0) {
                contAbaixoSete++;
            }
        }
        System.out.printf("Quantidade de notas abaixo de 7.0: %d\n", contAbaixoSete);

        
        System.out.println("\nPrograma encerrado. Obrigado!");

        scan.close();
    }
}
