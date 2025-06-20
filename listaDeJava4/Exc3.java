import java.util.Scanner;

public class Exc3 {
    //  Faça um programa que leia e valide as seguintes informações:
    //     Nome: maior que 3 caracteres;
    //     Idade: entre 0 e 150;
    //     Salário: maior que zero;
    //     Sexo: 'f' ou 'm';
    //     Estado Civil: 's', 'c', 'v', 'd'
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = "";
        int age = -1;
        double salary = 0;
        char sex = ' ';
        final String SEX_OPTIONS = "fFMm";
        char maritalStatus = ' ';
        final String MARITAL_STATUS_OPTIONS = "SsCcVvDd";
        // não é a melhor forma, to com preguiça de fazer ciquenta loops ent fiz essa gambiarra
        while(true){
            if(name.length() <= 3){
                System.out.println("Digite seu nome (o nome deve conter mais de 3 caracteres): ");
                name = scan.nextLine();
                continue;
            }

            if(age < 0 || age > 150){
                System.out.println("Digite sua idade (entre 0 e 150): ");
                age = scan.nextInt();
                scan.nextLine();
                continue;
            }

            if(salary > 0){
                System.out.println("Digite seu salario (deve ser maior que 0): ");
                salary = scan.nextDouble();
                scan.nextLine();
                continue;
            }


            if(SEX_OPTIONS.indexOf(sex) == -1){
                System.out.println("Digite seu sexo: [f] ou [m]");
                sex = scan.nextLine().charAt(0);
                continue;
            }

            if(MARITAL_STATUS_OPTIONS.indexOf(maritalStatus) == -1){
                System.out.println("Digite seu sexo: [s] | [c] | [v] | [d]");
                maritalStatus = scan.nextLine().charAt(0);
                continue;
            }
            break;
        }
        scan.close();
        

    }
}
