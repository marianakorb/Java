package aula.heranca;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Carlos");
		p4.setNome("Fernanda");
		
		p1.setSexo("M");
		p4.setSetor("RH");
		p2.setIdade(29);
		p2.setCurso("Informática");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
	

}
