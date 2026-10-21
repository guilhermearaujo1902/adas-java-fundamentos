import modelos.Livro;

public class LivroMain {

    public static void main(String[] args) {

        Livro livro1 = new Livro(4785, "Harry Potter e a Pedra Filosoval");

        livro1.setQuantidade(50);
        livro1.setDisponivel(false);

        livro1.exibirDados();
        livro1.verificarDisponibilidade();

        livro1.setDisponivel(true);
        livro1.comprar(25);
        livro1.exibirDados();

        livro1.vender(300);
        livro1.exibirDados();

        livro1.vender(35);
        livro1.exibirDados();

    }

}
