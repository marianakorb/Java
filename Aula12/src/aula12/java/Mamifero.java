package aula12.java;

public class Mamifero extends Animal {
	
	private String corPelo;
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimenta() {
		System.out.println("mamando");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void emitirSom() {
		System.out.println("som de mamífero");
	}
		
	
}
