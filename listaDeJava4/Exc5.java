import java.util.Scanner;

public class Exc5 {
    // 5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas de
    //    crescimento iniciais. Valide a entrada e permita repetir a operação.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double countryA;
        double countryB;
        int years = 0;
        double growthRateA;
        double growthRateB;
        char repetir;

        while (true) {

            while (true) {
                System.out.println("Digite a populacao do pais A: ");
                countryA = scan.nextLong();
                if(countryA > 0) break;
                System.out.println("Numero invalido");
            }

            while (true) {
                System.out.println("Digite a populacao do pais B: ");
                countryB = scan.nextLong();
                if(countryB > 0 && countryB > countryA) break;
                System.out.println("Numero invalido");
            }

            while (true) {
                System.out.println("Digite a taxa de crescimento populacional do pais A: ");
                growthRateA = scan.nextDouble();
                if(growthRateA > 0) break;
                System.out.println("Taxa invalido");
            }
            while (true) {
                System.out.println("Digite a taxa de crescimento populacional do pais B: ");
                growthRateB = scan.nextDouble();
                if(growthRateB > 0 && growthRateB < growthRateA) break;
                System.out.println("Taxa invalido");
            }

            while (countryA < countryB) {
                countryA += countryA * (growthRateA / 100);
                countryB += countryB * (growthRateB / 100);
                years++;
            }
          
            scan.nextLine();
         

            System.out.printf("se passaram %d anos%n", years);
            System.out.println("Deseja repetir o programa? [s] | [n]");
            repetir = scan.nextLine().toLowerCase().charAt(0);
            if(repetir == 'n') break;
        }
        scan.close();
    }
}
