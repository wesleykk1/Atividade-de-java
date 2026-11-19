import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota, frequencia;

        System.out.println("Digite a nota:");
        nota = entrada.nextDouble();

        System.out.println("Digite a frequencia:");
        frequencia = entrada.nextDouble();

        if (nota >= 6 && frequencia >= 75) {

            if (nota >= 9 && frequencia >= 90) {
                System.out.println("Aluno destacado");
            } else {
                System.out.println("Aluno aprovado");
            }

        } else {

            if (frequencia >= 75) {
                System.out.println("Aluno em reavaliacao");
            } else {
                System.out.println("Aluno reprovado por frequencia");
            }

        }

    }
}