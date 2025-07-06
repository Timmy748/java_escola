import java.util.Scanner;

public class Exc006 {
    //  6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] medias = new double[10];

        for(int i = 0; i < 10; i++){
            double soma = 0;
            for(int j = 0; j < 4; j++){
                System.out.printf("Digite a %d° nota do %d° aluno: ", j+1, i+1);
                soma +=  scan.nextDouble();
                
            }
            medias[i] = soma / 4; 
        }


        for(int i = 0; i < 10; i++){
            if(medias[i] >= 7){
                System.out.printf("O %d° aluno teve media igual a %.2f%n", i + 1, medias[i]);

            }

        }

        scan.close();
    }
}
