import java.util.Scanner;

public class Exc014 {
    // 14. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade
    //     de números pares e a quantidade de números ímpares.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contadorPar = 0;
        int contadorImpar = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero");
            int num =  scan.nextInt();
            if(num % 2 == 0){
                contadorPar++;
            } else{
                contadorImpar++;
            }
        }
        System.out.printf("""
                impares: %d
                pares: %d
                """, contadorImpar, contadorPar);
        scan.close();
    }
}
