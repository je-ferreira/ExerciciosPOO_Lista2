package exercicio1;

import java.util.Scanner;

public class Candidato {

	private String nome;
	private Partido partido;
	
	
	//construtor
	public Candidato(String nome, Partido partido) {
		this.nome = nome;
		this.partido = partido;
	}

	public void mudarPartido(Partido partidoNovo) {
		partido = partidoNovo;
	}
	
	public void mostrarInfos() {
		System.out.println("Nome: " + nome);
		System.out.println("Partido nº: " + partido.getNumero());
		System.out.println("Nome do Partido: " + partido.getNome());
		System.out.println("Sigla do partido: " + partido.getSigla());
		System.out.println("Ideologia do partido: " + partido.getIdeologia());
	}
}
