package aula.heranca;

// CLASSE MÃE/PROGENITORA/SUPERCLASSE - DÁ ORIGEM À OUTRAS CLASSES
public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
		
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}


	public Pessoa() {
		super();
//		this.nome = nome;
//		this.idade = idade;
//		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public void fazerAniver() {
		this.idade++;
		
	}
	
	

}