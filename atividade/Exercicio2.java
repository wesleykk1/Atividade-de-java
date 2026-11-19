import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota, frequencia;

        System.out.println("Digite a nota:");
        nota = entrada.nextDouble();

        System.out.println("Digite a frequencia:");
        frequencia = entrada.nextDouble();

        if (nota >= 7 && frequencia >= 75) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

    }
}