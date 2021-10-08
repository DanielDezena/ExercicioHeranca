package br.bom.generation.exercicioPoli;



public class Todos {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica zzz = new Preguica();
	
		
		dog.setNome("Toby");
		dog.setIdade(5);
		dog.setSom("au au");
		
		horse.setNome("Philip");
		horse.setIdade(9);
		horse.setSom("iiirrrrí");
		
		zzz.setNome("Paulo");
		zzz.setIdade(7);
		zzz.setSom("AAAAAAAAAAAA");
		
		System.out.println("Nome do cachorro: " + dog.getNome() + "\nIdade: " + dog.getIdade()
		+ "\nQual som ele faz?: " + dog.getSom() + "\nO que ele gosta de fazer?: " + dog.getCachorro());
		
		System.out.println("\nNome do cavalo: " + horse.getNome() + "\nIdade: " + horse.getIdade()
		+ "\nQual som ele faz?: " + horse.getSom() + "\nO que ele gosta de fazer?: " + horse.getCavalo());
		
		System.out.println("\nNome da Preguiça: " + zzz.getNome() + "\nIdade: " + zzz.getIdade()
		+ "\nQual som que ela faz?: " + zzz.getSom() + "\nO que ela gosta de fazer?: " + zzz.getPreguica());

	}

}
