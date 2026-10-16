package modelos;

public class Produto {

    // Atributos ou Propriedades
    private String codigo;
    private String nome;
    private double valor;
    private boolean cadastroAtivo;

    // Construtor vazio
    public Produto () {

    }

    // Construtor com parâmetros
    public Produto (String codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.cadastroAtivo = true;
    }

    // ENCAPSULAMENTO (Métodos de Acesso)
    // GET - Métodos para buscar ou obter o valor das propriedades

    public String getCodigo () {
        return this.codigo;
    }

    public String getNome () {
        return this.nome;
    }

    public double getValor () {
        return this.valor;
    }

    public boolean getCadastroAtivo () {
        return this.cadastroAtivo;
    }


    // SET - Métodos para enviar valor para as propriedades

    public void setCodigo (String codigo) {
        this.codigo = codigo;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setValor (double valor) {
        this.valor = valor;
    }

    public void setCadastroAtivo (boolean cadastroAtivo) {
        this.cadastroAtivo = cadastroAtivo;
    }

}
