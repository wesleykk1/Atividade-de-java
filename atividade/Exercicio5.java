import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo, quantidade;
        double total = 0;

        System.out.println("Digite o codigo do produto:");
        codigo = entrada.nextInt();

        System.out.println("Digite a quantidade:");
        quantidade = entrada.nextInt();

        switch (codigo) {

            case 1:
                total = 50 * quantidade;
                break;

            case 2:
                total = 80 * quantidade;
                break;

            case 3:
                total = 150 * quantidade;
                break;

            default:
                System.out.println("Produto nao encontrado");
        }

        if (codigo >= 1 && codigo <= 3) {
            System.out.println("Valor total: R$ " + total);
        }

    }
}