 import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int turno, disciplina;

        System.out.println("Digite o turno:");
        turno = entrada.nextInt();

        System.out.println("Digite a disciplina:");
        disciplina = entrada.nextInt();

        switch (turno) {

            case 1:
                switch (disciplina) {

                    case 1:
                        System.out.println("Matematica");
                        break;

                    case 2:
                        System.out.println("Portugues");
                        break;

                    default:
                        System.out.println("Disciplina invalida");
                }
                break;

            case 2:
                switch (disciplina) {

                    case 1:
                        System.out.println("Historia");
                        break;

                    default:
                        System.out.println("Disciplina nao disponivel no periodo da tarde");
                }
                break;

            default:
                System.out.println("Turno invalido");
        }

    }
}