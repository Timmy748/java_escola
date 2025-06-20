import java.util.Scanner;

public class Exc1{
    //  1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int nota;
        while (true) {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextInt();

            if(nota >= 0 && nota <= 10) break;

            System.out.println("Nota invalida");
        }
        scan.close();
    }
}