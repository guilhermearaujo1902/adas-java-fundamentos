package relacionamento;

public class Categoria {

    private int codigo;
    private String nome;
    private boolean status;

    public Categoria() {
    }

    public Categoria(int codigo, String nome, boolean status) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
    }

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void exibirDados() {
        System.out.println("- Dados da Categoria -");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);

        if (this.status == true) {
            System.out.println(this.nome + " está ativa no sistema!");
        } else {
            System.out.println("Categoria temporariamente indisponível...");
        }
    }

    public void mudarStatus(boolean novoStatus) {
        this.status = novoStatus;
        System.out.println("Status de " + this.nome + " alterado com sucesso!");
    }

}
