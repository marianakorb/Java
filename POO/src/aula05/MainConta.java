package aula05;

import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual tipo de conta? cc (conta corrente) ou cp conta poupança: ");
		c1.setTipo(sc.next());
		String tipo = c1.getTipo();
		
		System.out.println("Digite seu nome");
		String nomeDono = sc.next();
		c1.setNomeDono(nomeDono);
		
		c1.abrirConta(tipo, nomeDono);
				
		c1.pagarMensalidade();
		
		/*
		 * c1.fecharConta(); c1.sacar(100); c1.fecharConta();
		 * 
		 * 
		 * 
		 * System.out.println("Quanto você deseja depositar: "); int deposito =
		 * sc.nextInt(); c1.depositar(deposito);
		 * 
		 * 
		 * System.out.println("Quanto você deseja sacar? Saldo: " + c1.getSaldo()); int
		 * saque = sc.nextInt(); c1.sacar(saque);
		 */
		
		
		c1.apresentarDadosAtuais();
		
		sc.close();
	}

}
