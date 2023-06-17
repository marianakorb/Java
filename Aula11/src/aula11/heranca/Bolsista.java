package aula11.heranca;

// BOLSISTA É UMA ESPECIALIZAÇÃO DE ALUNO 
// ALUNO É UMA GENERALIZAÇÕA DE BOLSISTA
public class Bolsista extends Aluno {
	private float bolsa;
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista. Pagamento facilitado.");
	}
}
