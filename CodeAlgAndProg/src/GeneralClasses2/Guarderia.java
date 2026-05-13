package GeneralClasses2;

public class Guarderia {
	private int[] edades;
	private int totalN;
	private final int MAX = 20;
	private String nombre;
	
	public Guarderia(String nombre) {
		this.nombre = nombre;
		this.edades = new int[MAX];
		this.totalN = 0;
	}
	
	public boolean altaNinio(int dato) {
		boolean resp = false;
		
		if(totalN<MAX) {
			resp = true;
			edades[totalN] = dato;
			totalN++;
		}
		return resp;
	}
	//inciso a)
	public int calculaConsumoPan() {
		int i,sumaP=0;
		
		
		for(i=0;i<totalN;i++) {
			switch (edades[i]) {
			case 0: sumaP = sumaP + 6;
				break;
			case 1: sumaP = sumaP + 4;
				break;
			case 2: sumaP = sumaP + 3;
				break;
			default: sumaP = sumaP + 2;
			}
		}
		return sumaP;
			
	}
	//inciso b)
	public double calculaPromConsumPan() {
		double promedio = -1;
		
		if(totalN>0)
			promedio = calculaConsumoPan() / totalN;
		return promedio;
	}
	
	//inciso c)
	public int encuentraCategMasConsumo() {
		int[] cont = {0,0,0};
		int i, edad,max = 0;
		
		for(i=0; i<totalN; i++) {
			edad = edades[i];
			cont[edad] = cont[edad] + 1;
			//cont[edades[i]] = cont[edades[i]] + 1;
			cont[0] = cont[0]*6;
			cont[1] = cont[1] * 4;
			cont[2] = cont[2]*3;
			cont[3] = cont[3]*2;
			if (cont[0]>cont[1] && cont[0]>cont[2] && cont[0]>cont[3]) {
				max = 0;
			}
			else {
				if (cont[1]>cont[2] && cont[1]>cont[3]) {
					max = 1;
				}
				else 
					if (cont[2]>cont[3]) {
						max = 2;
					}
					else
						max = 3;
			}
		}
		return max;
	}

}
