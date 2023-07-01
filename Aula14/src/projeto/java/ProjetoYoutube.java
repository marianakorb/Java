package projeto.java;

public class ProjetoYoutube {

	public static void main(String[] args) {
		
		Video v[] =  new Video[3];
		v[0] = new Video("Aula 01 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 09 de HTML5");
		
		Gafanhotos g[] = new Gafanhotos[2];
		g[0] = new Gafanhotos("Mariana", 21, "F", "Mari");
		g[1] = new Gafanhotos("João", 29, "M", "Juca");
		
		Visualizacao vz = new Visualizacao(g[0], v[2]);
		vz.avaliar();
		
		System.out.println(v[0].toString());
		System.out.println(g[0].toString());
		System.out.println(vz.toString());
	}

}
