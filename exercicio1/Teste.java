package exercicio1;

public class Teste {

	public static void main(String[] args) {
		
		Partido p1 = new Partido("Partido 1", "Ideologia 1", "P1", 1);
		Partido p2 = new Partido("Partido 2", "Ideologia 2", "P2", 2);
		
		Candidato c1 = new Candidato("Jessica", p1);
		Candidato c2 = new Candidato("Monica", p2);
		
		c1.mostrarInfos();
		System.out.println(" "); //apenas para espaçar
		c2.mostrarInfos();
		System.out.println(" "); //apenas para espaçar
		
		c1.mudarPartido(p2); //exemplo de mudança
		c1.mostrarInfos(); //exibe novos dados
	}

}
