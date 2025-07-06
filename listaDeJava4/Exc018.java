import java.util.Scanner;

public class Exc018 {
    //  18. Faça um programa que, dado um conjunto de N números, determine o menor valor, o
    //     maior valor e a soma dos valores.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos numeros deseja enviar");
        int num = scan.nextInt();
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int atual;
        for(int i = 1; i <= num; i++){
            System.out.printf("digite o %d° numero: ", i);
            atual = scan.nextInt();
            if(i == 1) menor = maior = atual;
            menor = menor < atual ? menor : atual; 
            maior = maior > atual ? maior : atual; 
            soma += atual;
        }
        System.out.println(menor);
        System.out.println(maior);
        System.out.println(soma);
        scan.close();
    }
}
