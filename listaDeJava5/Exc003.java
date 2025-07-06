import java.util.Scanner;

public class Exc003 {
    //  3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4];
        double media = 0.0;

        for(int i = 0; i < notas.length; i++){
            System.out.printf("Digite sua %d° nota: ", i+1);
            notas[i] = scan.nextDouble();
            media += notas[i];
        }

        media /= notas.length;
        for(int i = 0; i<notas.length; i++){
            System.out.printf("%d° nota: %.2f%n", i+1,notas[i]);
        }
        System.out.printf("Sua média foi %.2f", media);

        scan.close();

    }
}
