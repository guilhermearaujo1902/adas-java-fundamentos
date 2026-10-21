package modelos;

public class Livro {

    // Atributos
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private boolean disponivel;

    // Construtores

    public Livro() {

    }

    public Livro(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    // GET e SET

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    // Métodos próprios
    public void exibirDados() {
        System.out.println("Dados do livro");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade em estoque: " + this.quantidade);
        System.out.println("************************************\n");
    }

    public void verificarDisponibilidade() {
        if (this.disponivel) {
            System.out.println("O livro " + this.nome + " encontra-se disponível!");
        } else {
            System.out.println(this.nome + " está temporariamente indisponível...");
        }
    }

    public void comprar(int quantidadeCompra) {
        this.quantidade = this.quantidade + quantidadeCompra;
        System.out.println("Compra de " + quantidadeCompra + " exemplares realizada com sucesso!");
    }

    public void vender(int quantidadeVenda) {
        if (this.quantidade >= quantidadeVenda) {
            this.quantidade = this.quantidade - quantidadeVenda;
            System.out.println(quantidadeVenda + " exemplares vendidos com sucesso!");
        } else {
            System.out.println("Estoque insulficiente para a venda de " + quantidadeVenda + " exemplares...");
        }
    }

}
