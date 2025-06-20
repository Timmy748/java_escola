import java.util.Scanner;

public class Exc2 {
    //  2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name, password;
        while(true){
            System.out.println("Digite seu nome de usuario: ");
            name = scan.nextLine();
            System.out.println("Digite a sua senha: ");
            password = scan.nextLine();
            if(!name.equals(password)) break;
            System.out.println("Nome e Senha devem ser diferentes");
        }
        scan.close();
    }
}
