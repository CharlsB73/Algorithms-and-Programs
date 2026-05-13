package GeneralClasses2;

import Arrays.ArrayHandler;

public class Party {
	private String fecha;
	private String lugar;
	private String [] nomInv;
	private int totInv;
	private final int max = 100;
	
	public Party(String fecha, String lugar, int max) {
		this.fecha = fecha;
		this.lugar = lugar;
		nomInv = new String[max];
		totInv = 0;
		
	}
	
	public Party(String fecha, String lugar) {
		this.fecha = fecha;
		this.lugar = lugar;
		nomInv = new String[max];
		totInv = 0;
		
	}
	
	public boolean agregaInv(String invitado) {
		boolean resp = false;
		
		if (totInv<nomInv.length) { //Hay espacio
			int pos;
			pos = ArrayHandler.buscaSecuencialString(nomInv, totInv, invitado);
			if(pos<0) { //No se repite
				nomInv[totInv] = invitado;
				totInv++;
				resp = true;
			}
		}
		return resp;
			
	}
	
	public boolean quitaInv(String invitado) {
		boolean resp;
		int nuevoTot;
		nuevoTot = ArrayHandler.eliminaDato2(nomInv, totInv, invitado);
		
		if(nuevoTot<totInv) {
			resp = true;
			totInv = nuevoTot;
		}
		else
			resp = false;
		
		return resp;
		
	}
	
	public String toString() {
		StringBuilder sB = new StringBuilder();
		sB.append("\nLa fiesta será el día: ").append(fecha);
		sB.append("\nEn: ").append(lugar);
		
		for (int i = 0; i<totInv; i++) {
			sB.append("\n").append(nomInv[i]);
		}
		return sB.toString();
		
	}
	
	public String obtenerPrimero() {
		String primero;
		if (totInv>0) {
			primero = nomInv[0];
		}
		else {
			primero = null;
		}
		return primero;
	}
	
	public String obtenerÚltimo() {
		String ultimo;
		if(totInv>0) {
			ultimo = nomInv[totInv-1];
		}
		else {
			ultimo = null;
		}
		return ultimo;
	}
	
	


}
