package jana60;

import java.text.DecimalFormat;


public class Biglietto {
	
		// Attributi
	
		private double prezzoKm = 0.21, scontoUnder18 = 0.2, scontoOver65 = 0.4;
		private int etaPasseggero;
		private double km;

		DecimalFormat df = new DecimalFormat("#0.00€");

		// Costruttori
		
		public Biglietto(int etaPasseggero, double km) {
			super();
			this.km = km;
			this.etaPasseggero = etaPasseggero;
		}

		// Metodi

		public double calcoloPrezzo() {
			double prezzo = 0.0;
			prezzo = km * prezzoKm;
			if (etaPasseggero > 65) {
				return prezzo - (prezzo * scontoOver65);
			} else if (etaPasseggero < 18) {
				return prezzo - (prezzo * scontoUnder18);
			} else {
				return prezzo;
			}
		}
		
		// Formattazione prezzo a due cifre decimali
		public String formattaPrezzo()
		{
			return df.format((calcoloPrezzo()));
		}

		public String ScontiPasseggeri() {
			String MessaggioSconto = "Ciao, ";
			if (etaPasseggero > 65) {
				MessaggioSconto += "hai uno sconto sul prezzo finale del 40%";
			} else if (etaPasseggero < 18) {
				MessaggioSconto += "hai uno sconto sul prezzo finale del 20%";
			} else {
				MessaggioSconto += "haghi il costo del biglietto per intero";
			}
			return MessaggioSconto += "il costo finale del biglietto è di" + " " + formattaPrezzo();

		}

}
