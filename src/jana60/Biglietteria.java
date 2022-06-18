package jana60;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {

		//Creazione Ticket che eredita gli attributi della classe Biglietto
		Biglietto Ticket = new Biglietto(0,0);
		
		Scanner scan = new Scanner(System.in);
		
		//Chiedo all'utente di inserire l'età
		System.out.print("Inserisci la tua etá: ");
		Ticket.setetaPass(Integer.parseInt(scan.nextLine()));
		
		//Chiedo all'utente i chilometri
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		Ticket.setkm(Float.parseFloat(scan.nextLine()));
		
		
		//Frase finale che eredita i metodi della classe biglietto
		System.out.println("Ciao, il prezzo del tuo biglietto è " + Ticket.formattaPrezzo());
		
		scan.close();
	}

}