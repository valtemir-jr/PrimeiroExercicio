import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variáveis
        int idade;
        double altura;
        int calculo;
        double alturacm;
        int inteiroAltura;
        Scanner sc = new Scanner(System.in);

        // Solicitação do nome
        System.out.println("Ola!");
        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();
        // Solicitação da idade
        System.out.println("Qual sua idade?");
        idade = sc.nextInt();
        // Solicitação da altura
        System.out.println("Qual sua altura?");
        altura = sc.nextDouble();

        // Calculos das variáveis
        calculo = 50-idade;
        alturacm = altura*100;
        inteiroAltura = (int) alturacm;

        // Saída do programa
        System.out.println("Seja bem vindo(a), " + nome);
        System.out.println("Em " + calculo + " anos você terá 50 anos de idade.");
        System.out.println("Sua altura em centímetros é igual a " + inteiroAltura + "cm.");
    }
}
