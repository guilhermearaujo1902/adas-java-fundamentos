import modelos.Produto;

public class ProdutoMain {
    public static void main(String[] args) {

        Produto produto1 = new Produto("PW-001", "Notebook Dell I11", 6500);

        // forma errada de obter valor da propriedade
        // System.out.println("Nome do produto: " + produto1.nome);

        // forma correta de obter valor da propriedade
        System.out.println("Nome do produto: " + produto1.getNome());

        System.out.println(produto1);


        // forma errada de enviar valor para a propriedade
        // produto1.nome = "bla bla bla";

        // forma correta de enviar valor para a propriedade
        produto1.setNome("Keyboard Gammer");

        System.out.println("Nome do produto: " + produto1.getNome());

    }
}
