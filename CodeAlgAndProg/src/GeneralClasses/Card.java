package GeneralClasses;

public class Card {
	private int numT;
	private String tipo;
	private int cat;
	private int numCta;
	private int anioAd;
	private int anioVen;
	private int nip;
	private double limCred; //platinum=50000, oro=30000, azul=20000
	private double saldo;
	
	
	public Card(int numT, String tipo, int cat, int numCta, int anioAd) { //hacer switch para limCred y anioVen
		this.numT = numT;
		this.tipo = tipo;
		this.cat = cat;
		this.anioAd = anioAd;
		this.anioVen = anioAd +5;
		this.saldo = 0;
		
		switch (cat) {
		case 0: limCred = 20000;
				break;
		case 1: limCred = 30000;
				break;
		case 2: limCred = 50000;
				break;
		}
		
		
	}
	
	public int getNumT() {
		return numT;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getCat() {
		return cat;
	}
	
	public int getNumCta() {
		return numCta;
	}
	
	public int getAnioAd() {
		return anioAd;
	}
	
	public int getAnioVen() {
		return anioVen;
	}
	
	public String toString() {
		String cadena;
		cadena = "Datos de la tarjeta" + numT + numCta + tipo + cat + anioAd;
		return cadena;
	}
	
	public boolean equals(int numT) {
		boolean resultado=false;
		if(this.numT == numT) {
			resultado = true;
		}
		return resultado;
	}
	
	public int compareTo(GeneralClasses.Card otra) {
		return this.numT - otra.numT;
	}
	
	public boolean activaTarjeta(int nueva) {
		this.nip = nueva;
		return true;
	}
	
	public double calcCredDisp() {
		return this.limCred - saldo;
	}
	
	public double calcComision() {
		double comision=0;
		
		if (tipo.equalsIgnoreCase("titular")) {
			if (cat == 2) {
				comision = limCred*0.01;
			}
			else
				comision = limCred*0.005;
		}
		else
			switch(cat) {
			case 0: comision = limCred*0.001;
					break;
			case 1: comision = limCred*0.002;
					break;
			case 2: comision = limCred*0.005;
					break;
			}
			
		
		return comision;
	}

}
