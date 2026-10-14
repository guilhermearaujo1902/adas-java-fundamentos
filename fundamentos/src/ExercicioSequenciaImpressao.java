import java.util.Scanner;

public class ExercicioSequenciaImpressao {

    /*
        Imprimir uma sequencia de números seguindo as regras abaixo
        - pedir para o usuário o número final da contagem
        - imprimir a contagem até o número informado, sendo
            - se o número for PAR imprimir o dobro do número
            - se o número for ÍMPAR imprimir a multiplicação do número por 3
        - ao final do laço, imprimir o maior número PAR e o maior número ÍMPAR
     */

    // numero % 2 == 0 quer dizer que o número é par

    // 1 2 3 4 5
    // Saída de dados esperada
    // 3 4 9 8 15

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número final da contagem ");
        int numeroFinal = leitor.nextInt();

        int maiorPar = 0;
        int maiorImpar = 0;

        for (int cont = 1; cont <= numeroFinal; cont++) {

            int auxiliar = 0;

            if (cont % 2 == 0) {

                auxiliar = cont * 2;
                if (auxiliar > maiorPar) {
                    maiorPar = auxiliar;
                }
                System.out.print((auxiliar) + " - ");

            } else {

                auxiliar = cont * 3;
                if (auxiliar > maiorImpar) {
                    maiorImpar = auxiliar;
                }
                System.out.print((auxiliar) + " - ");

            }

        }

        System.out.println();

        System.out.println("O maior número Par encontrado foi " + maiorPar);
        System.out.println("\nO maior número Ímpar encontrado foi " + maiorImpar);

    }


}
