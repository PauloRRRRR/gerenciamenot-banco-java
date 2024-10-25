package desafio_dio_banco;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial = 500; // Novo atributo

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente, incluindo cheque especial.");
        }
    }

    @Override
    public void imprimirInfos() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfos();
        System.out.println(String.format("Limite Cheque Especial: %.2f", this.limiteChequeEspecial));
    }
}
