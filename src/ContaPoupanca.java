public class ContaPoupanca extends Conta {
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
        return "Conta Corrente com saldo: " + getSaldo();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        super.imprimirExtrato();
    }
}

