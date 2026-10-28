package polimorfismo;

public class Cartao {

    private int numero;
    private String banco;
    private String bandeira;
    private boolean bloqueado;

    public Cartao () {

    }

    public Cartao(int numero, String banco, String bandeira, boolean bloqueado) {
        this.numero = numero;
        this.banco = banco;
        this.bandeira = bandeira;
        this.bloqueado = bloqueado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public void comprar (String metodoPagamento, double valor) {
        if (this.bloqueado) {
            System.out.println("Compra no " + metodoPagamento + " negada. Cartão bloqueado!");
        } else {
            System.out.println("Compra de R$ " + valor + " realizada com sucesso!");
        }
    }

    public void exibirDados () {
        System.out.println("Dados do cartao");
        System.out.println("Número: " + this.numero);
        System.out.println("Banco: " + this.banco);
        System.out.println("Bandeira: " + this.bandeira);

        if (this.bloqueado) {
            System.out.println("Cartão Bloqueado!");
        } else {
            System.out.println("Cartão disponível para compras.");
        }
    }
}
