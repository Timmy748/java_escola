

public class Exc16 {
    //  16. A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55,... Faça um
    //      programa que gere a série até que o valor seja maior que 500.
    public static void main(String[] args) {
        int atual = 1;
        int anterior = 0;
        int proximo = 0;
        // seria melhor usar um while mas to com preguiça
        for(int i = 1; atual < 500; i++){
            System.out.printf("%d°: %d%n", i, atual);
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
        }
    }
}
