package polimorfismo;

public class CartaoBlack extends Cartao {

    private int milhas;
    private double saldoCashback;

    public CartaoBlack () {

    }

    public CartaoBlack(int numero, String banco, String bandeira, boolean bloqueado, int milhas, double saldoCashback) {
        super(numero, banco, bandeira, bloqueado);
        this.milhas = milhas;
        this.saldoCashback = saldoCashback;
    }

    public int getMilhas() {
        return milhas;
    }

    public void setMilhas(int milhas) {
        this.milhas = milhas;
    }

    public double getSaldoCashback() {
        return saldoCashback;
    }

    public void setSaldoCashback(double saldoCashback) {
        this.saldoCashback = saldoCashback;
    }

    public void acumularMilhas (double valor) {
        int milhasConvertidas = (int) valor / 20;
        this.milhas += milhasConvertidas;
        System.out.println("Essa compra gerou " + milhasConvertidas + " milhas.");
    }

    public void addCashback (double valor) {
        double valorCashback = valor * 0.03;
        this.saldoCashback += valorCashback;
        System.out.println("Essa compra gerou R$ " + valorCashback + " em cashback!");
    }

    public void comprar (String metodoPagamento, double valor) {
        System.out.println("Compra no Cartão Black registrada!");
        if (this.isBloqueado()) {
            System.out.println("Compra no " + metodoPagamento + " negada. Cartão bloqueado!");
        } else {
            System.out.println("Compra de R$ " + valor + " realizada com sucesso!");
        }

        this.acumularMilhas(valor);
        this.addCashback(valor);
    }
}
