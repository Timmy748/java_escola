import java.util.Scanner;

public class Exc004 {
    //  4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram
    //     lidas. Imprima as consoantes.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char[] letras = new char[10];
        final String VOGAIS = "aeiou";
        int consoantesCounter = 0;

        for(int i = 0; i < letras.length; i++){
            System.out.println("Digite uma letra: ");
            char letra = scan.nextLine().charAt(0);
            // Character é uma classe wrapper ent n seria pra usar, mas acho feio escrever uma constante com todas as consoantes
            if(Character.isLetter(letra) && VOGAIS.indexOf(Character.toLowerCase(letra)) == -1){
                letras[i] = letra;
                consoantesCounter++;
            }
        }

        for(int i = 0; i < letras.length; i++){
            if(Character.isLetter(letras[i])){
                System.out.println(letras[i]);
            }
        }
        System.out.printf("o numero de consoantes digitadas foi: %d", consoantesCounter);
        scan.close();
    }
}

