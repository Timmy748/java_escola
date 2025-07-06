import java.util.Scanner;
public class Exc012 {
    // 12. Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine
    // quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses
    // alunos.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int TOTAL = 30;
        int[] idades = new int[TOTAL];
        double[] alturas = new double[TOTAL];


        System.out.println("Digite a idade e altura de 30 alunos:");
        for (int i = 0; i < TOTAL; i++) {
            System.out.printf("Idade do %d° aluno: ", i+1);
            idades[i] = scan.nextInt();

            System.out.printf("Altura do %d°aluno: ", i+1);;
            alturas[i] = scan.nextDouble();
        }

        double somaAlturas = 0;
        for (int i = 0; i < TOTAL; i++) {
            somaAlturas += alturas[i];
        }
        double mediaAltura = somaAlturas / TOTAL;

        int contador = 0;
        for (int i = 0; i < TOTAL; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }


        System.out.printf("Média de altura: %.2f", mediaAltura);
        System.out.printf("Número de alunos com mais de 13 anos e altura inferior à média: %d", contador);


        scan.close();
    }
}
