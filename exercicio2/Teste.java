package exercicio2;

public class Teste {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Doc doc = new Doc();
		
		//atribuindo valores por set (podia ser construtor)

		c1.setNome("Cliente 1");
		c1.setSaldo(10);
		c1.setLimite(0);

		c2.setNome("Cliente 2");
		c2.setSaldo(10);
		c2.setLimite(0);

		//testes dos métodos
		
		c1.depositar(1);
		c1.checarSaldo();

		doc.transferir(c1, c2, 5);
		doc.transferir(c1, c2, 20);
		doc.transferir(c1, c2, 10);
		doc.transferir(c1, c2, 1);

	}

}
