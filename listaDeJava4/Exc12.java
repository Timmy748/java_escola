import java.util.Scanner;

public class Exc12 {
    // 12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
    //     inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a
    //     tabuada. A saída deve ser conforme o exemplo abaixo:
    //     Tabuada de 5:
    //     5 X1=5
    //     5 X2=10
    //     ...
    //     5 X10=50
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Digite um numero");
            num = scan.nextInt();
            if(num >= 1 && num <= 10 ) break;
            System.out.println("Numero invalido");
        }
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d%n", num, i, num * i);
        }
        scan.close();
   
    }
}
