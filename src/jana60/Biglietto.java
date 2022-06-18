package jana60;

import java.text.DecimalFormat;


public class Biglietto {
	
	// Attributi
	
	private int etaPass;
	private float km;	
	private float przkm = 0.21f;
	private float scontoU18 = 0.2f;
	private float scontoO65 = 0.4f;
	
	
	//Costruttori
	
	public Biglietto(int etaPassC, float kmC) {
		etaPass = etaPassC;
		km = kmC;
	}
	
	// get e set

	public void setkm(float kmX) {
		km = kmX;
	}

	public void setetaPass(int etaPassX) {
		etaPass = etaPassX;
	}
	
	//metodi
	// metodo per il calcolo del prezzo del biglietto in base all'età	
	
	public double calcPrezzoTicket() {		
		
		double prezzoTicket = km * przkm;
		
		if (etaPass < 18) {
			prezzoTicket -= (prezzoTicket * scontoU18);
		} else if (etaPass >= 65) {
			prezzoTicket -= (prezzoTicket * scontoO65);
		}		
		return prezzoTicket;
	}
	
	//metodo per formattare il prezzo a due cifre decimali
	DecimalFormat df = new DecimalFormat("0.00€");
	
	public String formattaPrezzo() {		
		 return df.format(calcPrezzoTicket());		
	}
	
	
}
