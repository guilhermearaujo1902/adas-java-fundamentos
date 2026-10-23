package relacionamento;

public class Main {
    public static void main(String[] args) {

        // Declarando objetos da classe Categoria
        Categoria categoria1 = new Categoria(1, "Comida", true);

        Categoria categoria2 = new Categoria(2, "Bebida", true);

        Categoria categoria3 = new Categoria(3, "Sobremesa", false);


        // Declarando objetos da classe Produto
        Produto produto1 = new Produto(1, "Pizza Calabresa", 49.9, 15, categoria1);

        Produto produto2 = new Produto(2, "Coca Zero", 8.75, 80, categoria2);

        Produto produto3 = new Produto(3, "Donnut Nutella", 25.9, 30, categoria3);


        produto3.trocarCategoria(categoria3);


    }
}
