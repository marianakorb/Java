package aula05;

import java.util.Scanner;

public class ContaBancaria {
	
	
	private String numConta;
	private String tipo;
	private String nomeDono;
	private int saldo;
	private boolean status;
	
	public ContaBancaria() {
		this.numConta = "";
		this.tipo = "";
		this.nomeDono = "";
		this.saldo = 0;
		this.status = false;
	}
	
	Scanner sc = new Scanner(System.in);
	
//	public ContaBancaria(String numConta, char tipo, String nomeDono, int saldo, boolean status) {
//		this.numConta = numConta;
//		this.tipo = tipo;
//		this.nomeDono = nomeDono;
//		this.saldo = saldo;
//		this.status = status;
//	}
	
 	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getNumConta() {
		return this.numConta;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getNomeDono() {
		return this.nomeDono;
	}
	
	public int getSaldo() {
		return this.saldo;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	
	public void abrirConta(String tipo, String nomeDono) {
		this.tipo = tipo;
		
		if (tipo.contains("cp")) {
			this.saldo += 150;
		} else if (tipo.contains("cc")) {
			this.saldo += 50;
		}
				
		this.status = true;
		this.nomeDono = nomeDono;
	}
	
	
	public void depositar(int deposito) {
				
		if (getStatus() == true) {			
			this.saldo += deposito;
			
			System.out.println("Deposito feito com sucesso. Saldo atual: " + this.saldo);

		} else {
			System.out.println("Sua conta está fechada");
		}
	}
	
	public void sacar(int saque) {
		
		if(getStatus() == true) {
		
			if (saque <= this.saldo) {
				this.saldo -= saque;
				System.out.println("Saldo atual: " + getSaldo());
				
			} else {
				System.out.println("Saldo insuficiente para esse saque!");
			}
		} else {
			System.out.println("Não é possível sacar. Sua conta está fechada");
		}
		
		
	}
	
	public void fecharConta() {
		if (getStatus() == true) {

			if(this.saldo > 0) {
				System.out.println("Você possui dinheiro na conta");
	
				System.out.println("Deseja sacar tudo para fechar? sim  [s] OU nao [n] ");
				char res = sc.next().charAt(0);
				
				if (res == 's') {
					sacar(getSaldo());
					fecharConta();
				} else {
					System.out.println("Ok");
				} 
						
			} else if (this.saldo < 0) {
				System.out.println("Sua conta está negativa");
			
				System.out.println("Deseja pagar sua dívida para fechar? [s] ou [n]");
				char res = sc.next().charAt(0);
				
				if(res == 's') {
					depositar(getSaldo());
					fecharConta();
				}
				
			} else {
				this.status = false;
				System.out.println("Conta fechada com sucesso.");

			}
		} else {
			System.out.println("Sua conta já está fechada");
		}
	}
	
	public void pagarMensalidade() {
		int valor;
		
		if(getTipo().contains("cc")) {
			valor = 12;
		} else {
			valor = 20;
		}
		
		if (getStatus() == true) {
			
			if (this.saldo >= valor) {
				this.saldo -= valor;
				
				System.out.println("Mensalidade paga com sucesso! Novo saldo: " + this.saldo);
			} else {
				System.out.println("Saldo insuficiente para o pagamento.");
			}
		} else {
			System.out.println("Não há mensalidade para pagar");
		}
	}
	
	public void apresentarDadosAtuais() {
		System.out.println("Nome: " + this.nomeDono);
		System.out.println("Tipo conta: " + this.tipo);
		System.out.println("Status: " + this.status);
		System.out.println("Saldo atual: " + this.saldo);
		

	}
}

