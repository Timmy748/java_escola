import java.util.Scanner;

public class Exc011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = scan.nextInt();
        int soma = 0;
        for(int i = (numero1 + 1); i < numero2; i++){
            System.out.printf("%d ",i);
            soma += i;
        }
        System.out.println(soma);
        scan.close();
    }
}
