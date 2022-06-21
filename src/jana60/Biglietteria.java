package jana60;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {

		//Creazione Ticket che eredita gli attributi della classe Biglietto
		
		
		Scanner scan = new Scanner(System.in);
		
		//Chiedo all'utente di inserire l'et�
		System.out.print("Inserisci la tua et�: ");
		
		int eta = (Integer.parseInt(scan.nextLine()));
		
		//Chiedo all'utente i chilometri
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		float km = (Float.parseFloat(scan.nextLine()));
		
		Biglietto Ticket = new Biglietto(eta, km);
		
		
		//Frase finale che eredita i metodi della classe biglietto
		System.out.println("Ciao, il prezzo del tuo biglietto � " + Ticket.formattaPrezzo());
		
		scan.close();
	}

}