import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ola!");
        System.out.println("Qual seu nome?");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();
        System.out.println("Qual sua altura?");
        double altura = sc.nextDouble();
        int calculo = 50-idade;
        double alturacm = altura*100;
        int inteiroAltura = (int) alturacm;
        System.out.println("Seja bem vindo(a), " + nome);
        System.out.println("Em " + calculo + " anos você terá 50 anos de idade.");
        System.out.println("Sua altura em centímetros é igual a " + inteiroAltura);
    }
}
