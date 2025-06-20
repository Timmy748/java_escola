import java.util.Scanner;

public class Exc7 {
    //  7. Faça um programa que leia 5 números e informe o maior número.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long maior = 0;
        long atual;
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um numero: ");
            atual = scan.nextLong();
            if(i == 0) maior = atual;
            maior = maior > atual ? maior : atual;
        }
        System.out.println(maior);
        scan.close();
    }
}
