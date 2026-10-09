import java.util.Scanner;

public class Main {

    // Função principal, ou função pela qual a IDE executa o projeto
    public static void main(String[] args) {

        // Comando de Saída de dados
        System.out.println("Olá Adas Dev!");

        // Comando de Entrada de dados
        Scanner leitor = new Scanner(System.in);

        // Declarando variáveis
        String cadastro;
        String aluno = "Harry";
        int codigo = 123;
        double media = 7.8;
        boolean alunoAprovado = true;

        // Exemplo recebendo valores do usuário
        System.out.println("Olá, diga qual seu nome ");
        String nome = leitor.nextLine();

        // Exemplo de concatenação de dados
        System.out.println("Seja bem vindo ao sistema " + nome);


        // Condicional IF
        System.out.println("Digite sua idade ");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("Você já é MAIOR de idade!");
        } else {
            System.out.println("Ainda tem menos que 18 anos...");
        }


        // Repetição FOR
        for (int cont = 1; cont <= idade; cont++) {
            System.out.print(cont + " - ");
        }

    }


}