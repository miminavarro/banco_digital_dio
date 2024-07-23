import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected double saldo;
    protected final List<Transacao> extrato;

    public Conta() {
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
    }

    public void depositar(double valor) {
        this.saldo += valor;
        registrarTransacao("Depósito: " + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            registrarTransacao("Saque: " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

	public void transferir(Conta contaDestino, double valor) {
		if (valor <= saldo) {
			this.sacar(valor); // Saca da conta de origem
			contaDestino.depositar(valor); // Deposita na conta de destino
			registrarTransacao("Transferência de: " + valor + " para " + contaDestino);
			contaDestino.registrarTransacao("Transferência recebida de: " + valor + " para " + this);
		} else {
			System.out.println("Saldo insuficiente para transferência.");
		}
	}

    public void registrarTransacao(String descricao) {
        extrato.add(new Transacao(descricao));
    }

    public void imprimirExtrato() {
        System.out.println(">>> Atividades: ");
        for (Transacao transacao : extrato) {
            System.out.println(transacao);
        }
        System.out.println("=========================");
    }

    public double getSaldo() {
        return saldo;
    }
}


