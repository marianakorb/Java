package aula.heranca;


// CLASSE FILHA/SUBCLASSE - a classe Aluno herda caracteristicas da classe Pessso
public class Aluno extends Pessoa{
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}


	private String matricula;
	private String curso;
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public void cancelarMatricula() {
		System.out.println("Matrícula Cancelada.");
	}

	
	
}
