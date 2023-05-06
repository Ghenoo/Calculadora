import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();

        System.out.println("Escolha uma operação matemática:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão\n");

        int escolha = input.nextInt();

        System.out.print("Digite o primeiro valor: ");
        double valor1 = input.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = input.nextDouble();

        double resultado = 0;
        switch (escolha) {
            case 1:
                resultado = soma.calcular(valor1, valor2);
                break;
            case 2:
                resultado = subtracao.calcular(valor1, valor2);
                break;
            case 3:
                resultado = multiplicacao.calcular(valor1, valor2);
                break;
            case 4:
                resultado = divisao.calcular(valor1, valor2);
                break;
            default:
                System.out.println("Escolha inválida.");
                System.exit(0);
        }

        System.out.println("O resultado é: " + resultado);
        input.close();
    }
}