public class ContaCorrente extends Conta {
    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta Poupança com saldo: " + getSaldo();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirExtrato();
    }
}

