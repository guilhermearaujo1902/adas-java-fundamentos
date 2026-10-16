import modelos.Conta;

import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        Conta conta1 = new Conta("111.111.111-11", 123);

        String menu = "" +
                "\n**************************************" +
                "\n   A D A S    B A N K     " +
                "\n[1] Exibir Saldo" +
                "\n[2] Depositar" +
                "\n[3] Sacar" +
                "\n[0] Sair" +
                "\n**************************************" +
                "\nEscolha das opções à cima";

        int opcaoMenu;

        // Repetição WHILE
        do {
            System.out.println(menu);
            opcaoMenu = leitor.nextInt();

            // Condicional SWITCH
            switch (opcaoMenu) {

                case 1:
                    conta1.exibirSaldo();
                    break;
                case 2:
                    System.out.println("Qual valor a ser depositado?");
                    double valorDeposito = leitor.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Qual valor voce quer retirar?");
                    double valorSaque = leitor.nextDouble();
                    conta1.sacar(valorSaque);
                    break;
                case 0:
                    System.out.println("Saindo do sistema ....");
                    break;
                default:
                    System.out.println("Opção de menu inválida!");

            }

        } while (opcaoMenu != 0);
    }
}
