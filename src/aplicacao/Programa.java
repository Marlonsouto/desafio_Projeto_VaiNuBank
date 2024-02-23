package aplicacao;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import classes.ContaPoupanca;
import classes.VaiNuBank;
import classesAbstratas.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Conta> vNb = new HashSet<>();

		System.out.println("Menu de opcoes\n 1)Cadastro\n 2)Exclucao de Conta\n 3)Editar Nome\n4)   \n\nEscolha uma Opcao: ");
		byte opcao1 = sc.nextByte();

		do {
			try {
				switch (opcao1) {
				case 1: {
					System.out.println("Que tipo de conta voce deseja cadastrar?\n 1)Poupanca\n2)Corrente)");
					byte opcaoCadastro = sc.nextByte();
					VaiNuBank.cadastro(opcaoCadastro, sc);

				}

				case 2: {
					System.out.println("informe o numero da conta para excluir ? : ");
					int contaParaExcluir = sc.nextInt();

					VaiNuBank.excluirConta(contaParaExcluir);

				}
				case 3: {
					System.out.println("Insira o nome para alteracao: ");
					String nome = sc.nextLine();
					VaiNuBank.editarConta(nome);

				}

				default:
					throw new IllegalArgumentException("Unexpected value: " + opcao1);
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Insercao invalida " + e.getMessage());
			} catch (ParseException e) {
				// excessao pode estar relacionada a data
				System.out.println("valor invalido" + e.getMessage());
			}

		} while (opcao1 != 7);
	}

}
