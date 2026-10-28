package polimorfismo;

public class CartaoBasico extends Cartao {

    private double moedasDigitais;

    public CartaoBasico () {

    }

    public CartaoBasico(int numero, String banco, String bandeira, boolean bloqueado, double moedasDigitais) {
        super(numero, banco, bandeira, bloqueado);
        this.moedasDigitais = moedasDigitais;
    }

    public double getMoedasDigitais() {
        return moedasDigitais;
    }

    public void setMoedasDigitais(double moedasDigitais) {
        this.moedasDigitais = moedasDigitais;
    }

    public void converterMoedas (double valor) {
        double valorConvertido = valor / 5;
        this.moedasDigitais = this.moedasDigitais + valorConvertido;
        System.out.println("Essa compra gerou " + valorConvertido + " moedas digitais.");
//        this.moedasDigitais += valor / 5;
    }
}
