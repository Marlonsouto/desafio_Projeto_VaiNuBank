package classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import classesAbstratas.Conta;

public class VaiNuBank {

	
	static Set<Conta> vNb = new HashSet<>();
	Scanner sc = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

	public VaiNuBank(Set<Conta> vNb) {
		this.vNb = vNb;
	}

	public static void cadastro(byte opcao, Scanner sc) throws ParseException  {
		switch(opcao) {
		
	
		case 1:{

			System.out.println("Numero da conta: ");
			int numeroDaConta = sc.nextInt();
			System.out.println("Agencia: ");
			int agencia = sc.nextInt();
			System.out.println("Numero do Titular: ");
			String numeroDoTitular = sc.nextLine();
			System.out.println("CPF: ");
			int cpf = sc.nextInt();	
			System.out.println("");
			
					
			Date aniversario = sdf.parse(sc.nextLine());
			
			
			Conta contaPoupanca = new ContaPoupanca(numeroDaConta, agencia, numeroDoTitular, cpf, aniversario);
			vNb.add(contaPoupanca);
	
			
				
			}
		
			
		case 2:{
			System.out.println("Numero da conta: ");
			int numeroDaConta = sc.nextInt();
			System.out.println("Agencia: ");
			int agencia = sc.nextInt();
			System.out.println("Numero do Titular: ");
			int numeroDoTitular = sc.nextInt();
			System.out.println("CPF: ");
			int cpf = sc.nextInt();	
			System.out.println("Saldo: ");
			Double saldo = sc.nextDouble();
					
			Conta contaPoupanca = new ContaCorrente(numeroDaConta, agencia, numeroDoTitular, cpf,saldo);
			vNb.add(contaPoupanca);
			
			 
		}	
		}	
	}
	

	 public static void excluirConta(int contaPararRemover) {
		 for (Conta conta : vNb) {
			 if(conta.equals(contaPararRemover)) {
				 vNb.remove(conta);
				 
			 }else {
				 System.out.println("Conta nao encontrada...");
			 }
			
		}
			 
	 }
	 
	 public static void editarConta(String nome) {
		 for (Conta conta : vNb) {
			 if(conta.equals(nome)) {
			 conta.setNomeDoTtular(nome);
			 }else {
				 System.out.println("Nome nao encontrado...");
			 }
		}
		 
	 }

	@Override
	public String toString() {
		return "VaiNuBank [sc=" + sc + Conta. "  ]";
	}
	 
	 
	 

}
