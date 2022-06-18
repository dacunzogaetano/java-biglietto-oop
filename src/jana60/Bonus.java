package jana60;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		/* Quando si manda in esecuzione la classe Biglietteria, dopo un messaggio di benvenuto appare un menu in cui l’utente può scegliere se inserire un nuovo biglietto 
		o se terminare il programma. Se l’utente sceglie di inserire un biglietto, il programma chiede i dati del biglietto e stampa il prezzo. 
		Dopo di che ripresenta la scelta se inserire un biglietto o terminare il programma. Il programma termina solo se l’utente sceglie di terminare. */
		
			//Creazione Ticket che eredita gli attributi della classe Biglietto
			Biglietto Ticket = new Biglietto(0,0);
			//Risposta utente
			int risposta;
			
				
			Scanner scan = new Scanner(System.in);
			
			
				do {
					System.out.println(
							"Benvenuta/o, scrivi 1 se vuoi acquistare un biglietto o 2 per terminare il programma");
					risposta = (Integer.parseInt(scan.nextLine()));
					if (risposta == 1) {
						//Chiedo all'utente di inserire l'età
						System.out.print("Hai scelto di acquistare un biglietto, inserisci la tua etá: ");
						Ticket.setetaPass(Integer.parseInt(scan.nextLine()));

						//Chiedo all'utente i chilometri
						System.out.print("Inserisci il numero di chilometri da percorrere: ");
						Ticket.setkm(Float.parseFloat(scan.nextLine()));

						//Frase finale che eredita i metodi della classe biglietto
						System.out.println("Il prezzo del tuo biglietto è " + Ticket.formattaPrezzo());
					} else if (!(risposta == 1)) {
						System.out.println("Statt buon");
					} 
				} while (risposta == 1);
		scan.close();
		
	}

}
