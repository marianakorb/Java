package aula11.heranca;

public class Main {

	public static void main(String[] args) {
		
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(35);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Joana");
		a1.setIdade(25);
		a1.setSexo("F");
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Lucca");
		b1.setIdade(21);
		b1.setSexo("M");
		b1.setCurso("Programação");
		b1.setMatricula(17100);
		b1.setBolsa(12.5f);
		
		System.out.println(b1.toString());
		b1.pagarMensalidade();
		
		
		
		
	}

}
