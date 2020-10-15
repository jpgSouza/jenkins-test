package model.factory;

import java.util.Scanner;

import model.entities.Carteira;

public class CarteiraFactory {
	
	public static Carteira createCarteira(Scanner sc) {
		sc.nextLine();
		System.out.println("Entre com o nome da corretora");
		String corretora = sc.nextLine();
		
		return new Carteira(corretora);
	}
	
}
