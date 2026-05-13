package GeneralClasses2;

import GeneralClasses.Rectangle;

public class Club {
	private String nombre;
	private Rectangle[] albercas;
	private int totAlb;
	private final int MAX = 10;
	
	public Club() {
		albercas = new Rectangle[MAX];
		totAlb=0;
	}
	
	public Club( String nom, int max) {
		albercas = new Rectangle[max];
		totAlb=0;
		nombre=nom;
	}
	
	public boolean altaAlberca(double base, double altura) {
		boolean resp=false;
		
		if(totAlb<albercas.length) {
			resp=true;
			albercas[totAlb] = new Rectangle(base, altura);
			totAlb++;
		}
		return resp;
	}
	
	public double calculaCosto(double mt) {
		double costo=0;
		int i;
		for(i=0;i<totAlb;i++) {
			costo = costo+albercas[i].calculaArea();
		}
		costo=costo*mt;
		return costo;
	}
	
	public String toString() {
		StringBuilder sB = new StringBuilder();
		int i;
		
		sB.append("\nClub: " + nombre);
		sB.append("\nDatos de las albercas: \n");
		for(i=0;i<totAlb;i++) {
			sB.append("\nAlberca nro " + (i+1) + ("\n") + albercas[i]).append("\n");
		}
		return sB.toString();
	}

}
