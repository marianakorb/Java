package aula.heranca;

//CLASSE FILHA/SUBCLASSE
public class Professor extends Pessoa {
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}


	private String especialidade;
	private float salario;
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}


	public void receberAumento(float num) {
		this.salario =+ num;
	}
}
