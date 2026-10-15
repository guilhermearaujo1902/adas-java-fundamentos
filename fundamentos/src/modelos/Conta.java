package modelos;

public class Conta {

    public String cpfCliente;
    public int agencia;
    public double saldo;
    public int numeroConta;

    public Conta () {

    }

    public Conta (String cpf, int agencia) {
        this.cpfCliente = cpf;
        this.agencia = agencia;
    }

    public void exibirSaldo () {
        System.out.println("\n Saldo atual: R$ " + this.saldo + "\n");
    }

    public void depositar (double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        // this.saldo += valor;
    }

    public void sacar (double valor) {

        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            // this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insulficiente para realizar o saque de R$ " + valor);
        }

    }


}
