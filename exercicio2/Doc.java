package exercicio2;

public class Doc {

	public void transferir(Cliente c1, Cliente c2, double quantia) {
		if (quantia < c1.getSaldo()) {
			c2.setSaldo(c2.getSaldo()+quantia);
			c1.setSaldo(c1.getSaldo()-quantia);
			System.out.println("Doc de R$ " + quantia + " realizado com sucesso!");
			System.out.println("Saldo " + c1.getNome() +": R$ " + c1.getSaldo());
			System.out.println("Saldo " + c2.getNome() +": R$ " + c2.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para realizar o doc.");
		}
	}
}
