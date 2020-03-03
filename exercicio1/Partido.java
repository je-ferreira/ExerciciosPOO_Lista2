package exercicio1;

public class Partido {
	
	private String nome, ideologia, sigla;
	private int numero;
	
	
	//construtor
	public Partido(String nome, String ideologia, String sigla, int numero) {
		super();
		this.nome = nome;
		this.ideologia = ideologia;
		this.sigla = sigla;
		this.numero = numero;
	}


	//gets e sets
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public String getIdeologia() {return ideologia;}
	public void setIdeologia(String ideologia) {this.ideologia = ideologia;}

	public String getSigla() {return sigla;}
	public void setSigla(String sigla) {this.sigla = sigla;}

	public int getNumero() {return numero;}
	public void setNumero(int numero) {this.numero = numero;}
	
	
	
	

}
