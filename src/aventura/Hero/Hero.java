package aventura.Hero;
import static aventura.Hero.Colors.BLUE;
import static aventura.Hero.Colors.RED;
import static aventura.Hero.Colors.GREEN;
import static aventura.Hero.Colors.CYAN;
import static aventura.Hero.Colors.YELLOW;
import static aventura.Hero.Colors.RESET;


public class Hero<T> {
    private String nome;
    private int idade;
    private T tipo;


    // Construtor da classe
    public Hero(String nome, int idade, T tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método atacar com base no tipo de herói
    public void atacar() {
        String ataque;
        String cor;

        // Verificação do tipo e definição do ataque e cor correspondente
        if (tipo.equals("mago")) {
            ataque = "magia";
            cor = BLUE;
        } else if (tipo.equals("guerreiro")) {
            ataque = "espada";
            cor = RED;
        } else if (tipo.equals("monge")) {
            ataque = "artes marciais";
            cor = GREEN;
        } else if (tipo.equals("ninja")) {
            ataque = "shuriken";
            cor = CYAN;
        } else {
            ataque = "ataque desconhecido";
            cor = YELLOW;
        }

        // Exibição do ataque com cor
        System.out.println(cor + "O " + tipo + " " + nome + " atacou usando " + ataque + RESET);
    }

    // Getters para nome e idade
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public T getTipo() {
        return tipo;
    }
}
