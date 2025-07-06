import java.util.Scanner;

public class Exc014 {
    //  14. Faça um programa que faça 5 perguntas para 5 pessoas sobre um crime. As perguntas
    //     são:
    //     ▪ "Telefonou para a vítima?"
    //     ▪ "Esteve no local do crime?"
    //     ▪ "Mora perto da vítima?"
    //     ▪ "Devia para a vítima?"
    //     ▪ "Já trabalhou com a vítima?"
    //     O programa deve no final emitir uma classificação sobre a participação da pessoa no
    //     crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada
    //     como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário,
    //     ele será classificado como "Inocente". Mostrar um ranking de pessoas por ordem de
    //     suspeição
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        final int PESSOAS = 5;
        final int PERGUNTAS = 5;

        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };

        String[] nomes = new String[PESSOAS];
        int[] respostasPositivas = new int[PESSOAS];
        String[] classificacao = new String[PESSOAS];

        for (int i = 0; i < PESSOAS; i++) {
            System.out.printf("Digite o nome da pessoa %d: ", i + 1);
            nomes[i] = scan.nextLine().trim();

            int contSim = 0;
            for (int j = 0; j < PERGUNTAS; j++) {
                System.out.printf("%s (s/n): ", perguntas[j]);
                String resp = scan.nextLine().trim().toLowerCase();
                if (resp.startsWith("s")) {
                    contSim++;
                }
            }
            respostasPositivas[i] = contSim;


            if (contSim == 5) {
                classificacao[i] = "Assassino";
            } else if (contSim >= 3) {
                classificacao[i] = "Cúmplice";
            } else if (contSim == 2) {
                classificacao[i] = "Suspeita";
            } else {
                classificacao[i] = "Inocente";
            }

            System.out.println();
        }


        System.out.println("\n=== Resultado por pessoa ===\n");
        for (int i = 0; i < PESSOAS; i++) {
            System.out.printf("\n%s: %d respostas 'sim' → %s\n",
                              nomes[i], respostasPositivas[i], classificacao[i]);
        }


        Integer[] ordem = new Integer[PESSOAS];
        for (int i = 0; i < PESSOAS; i++) {
            ordem[i] = i;
        }

        for (int a = 0; a < PESSOAS - 1; a++) {
            for (int b = 0; b < PESSOAS - 1 - a; b++) {
                if (respostasPositivas[ordem[b]] < respostasPositivas[ordem[b + 1]]) {
                    int tmp = ordem[b];
                    ordem[b] = ordem[b + 1];
                    ordem[b + 1] = tmp;
                }
            }
        }

        System.out.println("\n=== Ranking de Suspeição ===\n");
        for (int rank = 0; rank < PESSOAS; rank++) {
            int idx = ordem[rank];
            System.out.printf("\n%dº - %s (%d respostas 'sim') - %s\n",
                              rank + 1, nomes[idx], respostasPositivas[idx], classificacao[idx]);
        }

        scan.close();
    }
}
