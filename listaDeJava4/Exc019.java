import java.util.Scanner;

public class Exc019 {
    //  19. Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos numeros deseja enviar");
        int num = scan.nextInt();
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int atual;
        for(int i = 1; i <= num; i++){
            while (true) {
                System.out.printf("digite o %d° numero: ", i);
                atual = scan.nextInt();
                if(atual >= 0 && atual <= 1000) break;
                System.out.println("Numero invalido");
            }
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
