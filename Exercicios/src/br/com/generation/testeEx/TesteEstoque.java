package br.com.generation.testeEx;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEstoque {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		ArrayList<Estoque> estoque = new ArrayList<>();
		
		System.out.println("-----------------------Seja bem vindo!!----------------------------");
		System.out.println("\nESCOLHA UMA DAS OPÇÕES PARA PROSSEGUIR");
		
		System.out.println();
		System.out.println(" [1] ADD PRODUTOS \n [2] REMOVER PRODUTOS \n [3] ATUALIZAR PRODUTOS");
		int op = leia.nextInt();
		
		String produto01 = "Detergente" , produto02 = "Tomate" , produto03 = "Cebola", produto04 = "Cerveja", produto05 = "Água";
		double preco01 = 5, preco02 = 3, preco03 = 5, preco04 = 25, preco05 = 2;
		
		estoque.add(new Estoque(produto01, preco01));
		estoque.add(new Estoque(produto02, preco02));
		estoque.add(new Estoque(produto03, preco03));
		estoque.add(new Estoque(produto04, preco04));
		estoque.add(new Estoque(produto05, preco05));
		
		System.out.println("\n\n---------------ESTOQUE ATUAL-------------------\n");
		
		for(Estoque i : estoque) {
			System.out.println(i);
		}
	
		System.out.println();
		
		
		if(op == 1) {
			
			System.out.println("Quantos produtos você quer adicionar? ");
			int quantProdutos = leia.nextInt();
			
			for(int i = 0; i < quantProdutos; i++) {
				System.out.println("Nome do produto para cadastro: ");
				String nome = leia.next();
				
				leia.nextLine();
				
				System.out.println("Preço do produto para cadastro: " );
				double preco = leia.nextDouble();
				
				estoque.add(new Estoque(nome,preco));
				
			}
			System.out.println("\nESTOQUE ATUALIZADO");
			for(Estoque x : estoque) {
				System.out.println(x);
			}
		}
		
		if(op == 2) {
			
				System.out.println("Digite a posição do produto que quer romover: ");
				int p = leia.nextInt();
				
				if( p == 1 ) {
					estoque.remove(0);
				}
				else if ( p == 2) {
					estoque.remove(1);
				}
				else if ( p == 3) {
					estoque.remove(2);
				}
				else if (p == 4) {
					estoque.remove(3);
				}
				else if (p == 5) {
					estoque.remove(4);
				}
				
			System.out.println("\nESTOQUE ATUALIZADO");
			for(Estoque x : estoque) {
				System.out.println(x);
			}
		}
		if (op == 3) {
			
			System.out.println("Digite a posição do produto que deseja atualizar: ");
			int at = leia.nextInt();
			
			System.out.println("Digite o novo valor do produto para atualizar: ");
			double novo = leia.nextDouble();
			
			if(at == 1) {
				estoque.remove(0);
				estoque.add(new Estoque(produto01, novo));
			}
			else if(at == 2) {
				estoque.remove(1);
				estoque.add(new Estoque(produto02, novo));
			}
			else if(at == 3) {
				estoque.remove(3);
				estoque.add(new Estoque(produto03, novo));
			}
			else if(at == 4) {
				estoque.remove(4);
				estoque.add(new Estoque(produto04, novo));
			}
			else if(at == 5) {
				estoque.remove(5);
				estoque.add(new Estoque(produto05, novo));
			}
			
			
			
			System.out.println("\nESTOQUE ATUALIZADO");
			for(Estoque x : estoque) {
				System.out.println(x);
			}
			
		}
		leia.close();

	}

}
