import java.util.Scanner;

public class Exc20 {
    //  20. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial
    //      várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha;
        int num;
        long fatorial = 1;
        while (true) {

            while (true) {
                System.out.println("Digite o numero que voce quer o fatorial");
                num = scan.nextInt();
                if(num > 0 && num <= 16) break;
                System.out.println("Numero invalido");
            }
            
            for(int i = 1; i <= num; i++){
                fatorial *= i;
            }
            scan.nextLine();
            System.out.println(fatorial);
            fatorial = 1;
            
            System.out.println("Deseja repetir o programa: [s] | [n]");
            escolha = scan.nextLine().toLowerCase().charAt(0);
            
            if(escolha == 'n') break;
        }
        scan.close();
    }
}
