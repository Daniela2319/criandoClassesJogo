import aventura.Hero.Hero;
import java.util.Scanner;

// Classe principal para interagir com o usuário e testar a classe Herói
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bem-vindo à criação de heróis!");

        while (continuar) {
            System.out.print("Digite o nome do herói: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade do herói: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite o tipo do herói (mago, guerreiro, monge, ninja): ");
            String tipo = scanner.nextLine().toLowerCase();

            // Criação do herói com base nos dados do usuário
            Hero<String> heroi = new Hero<>(nome, idade, tipo);

            // Exibe o ataque do herói
            heroi.atacar();

            // Pergunta ao usuário se quer criar outro herói
            System.out.print("\nDeseja criar outro herói? (s/n): ");
            String resposta = scanner.nextLine().toLowerCase();
            if (!resposta.equals("s")) {
                continuar = false;
                System.out.println("\nPrograma encerrado. Obrigado por jogar!");
            }
        }
        scanner.close();
    }
}