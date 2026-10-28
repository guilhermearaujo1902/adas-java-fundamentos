package polimorfismo;

public class Main {
    public static void main(String[] args) {


        CartaoBasico nubankRoxinho = new CartaoBasico(115577, "Nubank", "Mastercard", true, 0);
        nubankRoxinho.setBloqueado(false);

        double valorCompra = 17;

        nubankRoxinho.comprar("crédito", valorCompra);
//        nubankRoxinho.exibirDados();
//
//        nubankRoxinho.converterMoedas(valorCompra);
//        nubankRoxinho.exibirDados();


        System.out.println("\n\n\n");


        CartaoBlack nubankBlack = new CartaoBlack(224488, "Nubank", "Mastercard", false, 0, 0);

        double valorCompraAlto = 4800;

        nubankBlack.comprar("crédito", valorCompraAlto);

//        nubankBlack.exibirDados();
//        nubankBlack.acumularMilhas(valorCompraAlto);
//        nubankBlack.addCashback(valorCompraAlto);


    }
}
