package aula12.java;

public class Main {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru cang = new Canguru();
		
		m.setPeso(35.5f);
		m.setCorPelo("Marrom");
		m.alimenta();
//		m.locomover();
//		m.emitirSom();
//		
//		a.locomover();
//		
//		r.locomover();
//		
//		p.locomover();
		
		cang.locomover();
		

}

}	
				