

public class Exc4 {
    //  4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma
    //     taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com
    //     uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número
    //     de anos necessários para que a população do país A ultrapasse ou iguale a população
    //     do país B, mantidas as taxas de crescimento.
    public static void main(String[] args) {
        long countryA = 80000;
        long countryB = 200000;
        int years = 0;
        double growthRateA = 0.03;
        double growthRateB = 0.015;
        while (countryA < countryB) {
            countryA += countryA * growthRateA;
            countryB += countryB * growthRateB;
            years++;
        }
        System.out.printf("se passaram %d anos", years);
        
    }
}
