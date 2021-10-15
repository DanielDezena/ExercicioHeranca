package br.bom.generation.exercicioCollection;

import java.util.ArrayList;
import java.util.Scanner;


public class AdministrarEstoque {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Estoque> estoque = new ArrayList<>();
		int escolha = 0;
		
		estoque.add(new Estoque( "bolo", 23.99));
		estoque.add(new Estoque( "rosquinha", 3.99));
		
		System.out.println("|==Seja bem vinde no sistema de estoque da loja ItzDelicious!==|");
		
			while(escolha != 5) {
				System.out.println("\nO que deseja fazer hoje?\n[1] adicionar produto \n[2] "
						+ "remover produto \n[3] atualizar produto \n[4] checar lista\n[5] fechar");
				escolha = ler.nextInt();
			
				switch(escolha) {
				case 1:
					
					System.out.println("insira o nome do produto:");
					String nome = ler.next();
					ler.nextLine();
					System.out.println("por fim insira o preço do produto:");
					double valor = ler.nextDouble();
					System.out.println();
					estoque.add(new Estoque(nome, valor));
					System.out.println("produto adicionado com sucesso!");
				
					break;
				
				case 2:
					System.out.println("\nDigite a posição do produto selecionado:");
					int r = ler.nextInt();
					estoque.remove(r);
					System.out.println("produto removido com sucesso");
					break;
					
				case 3:
					System.out.println("insira o número do produto: ");
					int id = ler.nextInt();
					System.out.println("insira o novo nome do produto:");
					String novoNome = ler.next();
					System.out.println("por fim insira o novo preço do produto:");
					double novoPreco = ler.nextDouble();
					estoque.set(id,new Estoque(novoNome, novoPreco));
					System.out.println("produto atualizado com sucesso!");
					
					break;
				case 4:
					System.out.println("|==LISTA DE PRODUTOS==|");
					for(Estoque i : estoque) {
						System.out.println(i);
					}
					
					break;
				case 5:
					System.out.println("até mais!");
					break;
					
				default :
					System.out.println("OPERAÇÃO INVÁLIDA!");
					break;
			
				}
			
			
		}
			ler.close();
		
		

	}

}
