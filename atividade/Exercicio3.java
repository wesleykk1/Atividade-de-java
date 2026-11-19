import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();

        if (idade <= 12) {
            System.out.println("Atendimento infantil");
        } else if (idade <= 59) {
            System.out.println("Atendimento adulto");
        } else {
            System.out.println("Atendimento preferencial");
        }

    }
}