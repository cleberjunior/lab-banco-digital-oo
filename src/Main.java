import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Pessoa");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		List<Conta> lista = new ArrayList<>();
		lista.add(cc);
		lista.add(poupanca);

		Banco bb = new Banco();
		bb.setContas(lista);

		System.out.println("=== Contas existentes ===");
		System.out.println(bb.getContas().size());
	}
}
