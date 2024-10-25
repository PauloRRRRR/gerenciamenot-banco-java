package desafio_dio_banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Paulo Silva");
        cliente1.setCpf("123.456.789-00");

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(cliente1);
        cp.depositar(200);

        cc.imprimirInfos();
        System.out.println();
        cp.imprimirInfos();
    }
}
