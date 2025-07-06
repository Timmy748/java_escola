import java.util.Scanner;

public class Exc013 {
    // 13. Faça um programa que receba a temperatura média de cada mês do ano e
    // armazene-as em um vetor. Após isto, calcule a média anual das temperaturas e mostre
    // todas as temperaturas acima da média anual, e em que mês elas ocorreram (mostrar o
    // mês por extenso: 1– Janeiro, 2– Fevereiro, . . . ).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] temperaturas = new double[12];
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        // Leitura das temperaturas
        System.out.println("Digite a temperatura média de cada mês:");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%s: ", meses[i]);
            temperaturas[i] = scan.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < 12; i++) {
            soma += temperaturas[i];
        }
        double mediaAnual = soma / 12;


        System.out.printf("Média anual de temperatura: %.2f°C", mediaAnual);

        System.out.println("Meses com temperatura acima da média anual:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.printf("%s: %.2f°C", meses[i], temperaturas[i]);
            }
        }

        scan.close();
    }
}
