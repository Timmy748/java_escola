import java.util.Scanner;

public class Exc15 {
    //  15. A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55,... Faça um
    //      programa capaz de gerar a série até o n−ésimo termo.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int atual = 1;
        int anterior = 0;
        int proximo = 0;
        System.out.println("Digite ate qual numero da sequencia de fibonnaci voce deseja: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.printf("%d°: %d%n", i, atual);
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
        }
        scan.close();
    }
}
