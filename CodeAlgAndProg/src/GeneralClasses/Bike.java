package GeneralClasses;

public class Bike {
	private int numId;
	private int numAcc;
	private char tipo;
	private String material;
	
	public Bike() {
		
	}

	public Bike(int numId, int numAcc, char tipo, String material) {
		this.numId = numId;
		this.numAcc = numAcc;
		this.tipo = tipo;
		this.material = material;
	}
	
	public int getNumId() {
		return numId;
	}

	public String getMaterial(){
		return material;
	}
	
	public int compareTo(GeneralClasses.Bike otro) {
		return this.numId - otro.numId;
	}

	public double calcPrecio() {
		double resultado = 0;
		
		if (material == "aluminio") {
			if (numAcc<3) {
				switch (tipo) {
				case 'U': resultado = 7000 + 2000;
						break;
				case 'P': resultado = 15000 + 2000;
				
				case 'M': resultado = 27000 + 2000;
				}
			}
			else
				if (numAcc>2 && numAcc<5) {
					switch (tipo) {
					case 'U': resultado = 7000 + 2000 + 600;
							break;
					case 'P': resultado = 15000 + 2000 + 600;
							break;
					case 'M': resultado = 27000 + 2000 + 600;
							break;
					}		
				}
				else
					if (numAcc>4) {
						switch (tipo) {
						case 'U': resultado = 7000 + 2000 + 600;
								break;
						case 'P': resultado = 15000 + 2000 + 600;
								break;
						case 'M': resultado = 27000 + 2000 + 600;
								break;
						}
					}
					else
						resultado = 0;
		}
		else
			if (numAcc<3) {
				switch (tipo) {
				case 'U': resultado = 7000 + 5000;
						break;
				case 'P': resultado = 15000 + 5000;
				
				case 'M': resultado = 27000 + 5000;
				}
			}
			else
				if (numAcc>2 && numAcc<5) {
					switch (tipo) {
					case 'U': resultado = 7000 + 5000 + 600;
							break;
					case 'P': resultado = 15000 + 5000 + 600;
							break;
					case 'M': resultado = 27000 + 5000 + 600;
							break;
					}		
				}
				else
					if (numAcc>4) {
						switch (tipo) {
						case 'U': resultado = 7000 + 5000 + 600;
								break;
						case 'P': resultado = 15000 + 5000 + 600;
								break;
						case 'M': resultado = 27000 + 5000 + 600;
								break;
						}
					}
					else
						resultado = 0;
		
		return resultado;
	}
}	