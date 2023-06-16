package aula07;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	
	// Métodos Especias 
	
	public Lutador(String nome, String nac, int idade, float altura, float peso, int vit, int der, int emp) {
		this.nome = nome;
		this.nacionalidade = nac;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitorias = vit;
		this.derrotas = der;
		this.empates = emp;
		
	}

	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}


	public String getCategoria() {
		return categoria;
	}


	private void setCategoria() {
		
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
			
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
			
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
			
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
			
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}



	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}



	public int getDerrotas() {
		return derrotas;
	}



	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}



	public int getEmpates() {
		return empates;
	}



	public void setEmpates(int empates) {
		this.empates = empates;
	}



	public void apresentar() {
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println(getIdade() + " anos");
		System.out.println(getAltura() + "m de altura");
		System.out.println("Pesando " + getPeso() + "kg");
		System.out.println("Ganhou: " + getVitorias() + " vezes");
		System.out.println("Perdeu: " + getDerrotas() + " vezes");
		System.out.println("Empatou: " + getEmpates() + " vezes");
	}
	
	public void status() {
		System.out.print(getNome());
		System.out.println(" é um peso " + getCategoria());
		System.out.println(getVitorias() + " vitórias");
		System.out.println(getDerrotas()+ " derrotas");
		System.out.println(getEmpates() + " empates");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
}
