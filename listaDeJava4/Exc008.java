import java.util.Scanner;

public class Exc008 {
    //  8. Faça um programa que leia 5 números e informe a soma e a média dos
    //     números.
    public static void main(String[] args) {
        double soma = 0;
        double media = 0;
        int i;
        Scanner scan = new Scanner(System.in);
        
        for(i = 0; i < 5; i++){
            System.out.println("Digite um numero");
            soma += scan.nextDouble();
        }

        media = soma / i;
        System.out.printf("""
                A soma dos numeros e igual a %f 
                A media dos numeros e igual a %f 
                """, soma, media);

        scan.close();
    }
}
