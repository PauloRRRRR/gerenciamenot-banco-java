package desafio_dio_banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInfos() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfos();
    }
}
