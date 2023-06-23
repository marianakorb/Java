package aula12.java;

public class Peixe extends Animal {
	
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("nadando");
	}

	@Override
	public void alimenta() {
		System.out.println("comendo susbstâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("mudo");
	}
	
	public void soltarBolhas() {
		
	}

}
