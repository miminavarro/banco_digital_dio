public class Main {
    public static void main(String[] args) {
        // Criar conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(2000);
        contaCorrente.sacar(400);
        contaCorrente.imprimirExtrato();

        // Criar conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(600);
        contaPoupanca.sacar(200);
        contaPoupanca.imprimirExtrato();

        // Transferência entre contas
        contaCorrente.transferir(contaPoupanca, 200);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}

