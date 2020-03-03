package exercicio2;

public class Cliente {
	
	private String nome;
	private double saldo, limite;
			
	public String getNome() {return nome;}
	public double getSaldo() {return saldo;}
	public double getLimite() {return limite;}
		
	public void setNome(String nome) {this.nome = nome;}
	public void setSaldo(double saldo) {this.saldo = saldo;}
	public void setLimite(double limite) {this.limite = limite;}
	
	
	public void sacar(double val) {
		if (saldo+limite > val) {
			saldo = saldo - val;
			System.out.println("Saque de R$ " + val + " realizado com sucesso!");
		} else {
			System.out.println("Não há saldo/limite disponível para sacar.");
		}	
	}
	
	public void depositar (double val){
		saldo = saldo + val;
	}
	
	public void checarSaldo() {
		System.out.println("Saldo + Limite: R$ " + (saldo+limite));
	}

}
