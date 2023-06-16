package aula.heranca;

//CLASSE FILHA/SUBCLASSE
public class Funcionario extends Pessoa {
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}


	private String setor;
	private boolean trabalhando;
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	
	public void mudaTrabalho() {
		this.trabalhando = !this.trabalhando;
	}

}
