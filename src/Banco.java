import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private final String nome;
	private final List<Conta> contas;

	public Banco(String nome){
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	public String setNome(){
		return nome;
	}
	public List<Conta> setContas(){
		return Collections.unmodifiableList(contas);
	}
	public void adicionarConta(Conta conta){
		this.contas.add(conta);
	}
}


