import java.util.Scanner;

public class Exc008 {
    //  8. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.

    public static void main(String[] args) {
        final int LENGTH = 5;
        Scanner scan = new Scanner(System.in);
        int[] age = new int[LENGTH];
        double[] height = new double[LENGTH];

        for(int i = 0; i < LENGTH; i++){
            System.out.println("Digite sua altura: ");
            height[i] = scan.nextDouble();
            System.out.println("Digite sua idade: ");
            age[i] = scan.nextInt();
        }

        for(int i = LENGTH - 1; i >= 0; i--){
            System.out.printf("""
                ---------- %d° pessoa ----------
                Altura: %.2f
                Idade:  %d
                    """,i+1,height[i],age[i]);
        }
        scan.close();
    }
}
