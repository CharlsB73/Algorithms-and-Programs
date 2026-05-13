package GeneralClasses;

public class BikeLab {
	
	//Atributos
	private static int numSerie = 200;
	private int id;
	private char tipo;
	private int numAcc;
	private String material;
	
	//Constructores
	public BikeLab(char t, int numA, String mat) {
		tipo = Character.toUpperCase(t); //Char
		numAcc = numA;
		material = mat.toLowerCase(); //String FiBra --> fibra, FIBRA -->
		id = numSerie;
		numSerie++;
	}
	
	public BikeLab(char tipo, String material) {
		this.tipo = Character.toUpperCase(tipo);
		this.material = material.toLowerCase();
		id = numSerie;
		numSerie++;
		
	}

	//Gets, sets, equal, compareTo, toString
	public String toString() {
		
		return "BikeLab id=" + id + ", tipo=" + tipo + ", numAcc=" + numAcc + ", material=" + material;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getNumAcc() {
		return numAcc;
	}

	public void setNumAcc(int numAcc) {
		this.numAcc = numAcc;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public int compareTo(BikeLab otra) {
		return this.id-otra.id;
	}
	
	
	//Métodos y funciones
	public double calcPrecio() {
		int precio=0;
		switch (tipo) {
		case 'U':
				switch (material) {
				case "aluminio":	
								if (numAcc<3) {
									precio = 700 + 2000;
								}
								else 
									if (numAcc>=3 || numAcc<=4) {
										precio = 700 + 2000 + 500;
									}
									else
										precio = 700 + 2000 + 1000;
									break;
				case "fibra":
										if (numAcc<3) {
											precio = 700 + 4000;
										}
										else
											if (numAcc>=3 || numAcc<=4) {
												precio = 700 + 4000 + 500;
											}
											else
												precio = 700 + 4000 + 1000;
								break;
				}
						break;
		case 'P':
			switch (material) {
			case "aluminio":	
							if (numAcc<3) {
								precio = 12000 + 2000;
							}
							else 
								if (numAcc>=3 || numAcc<=4) {
									precio = 12000 + 2000 + 500;
								}
								else
									precio = 12000 + 2000 + 1000;
								break;
			case "fibra":
									if (numAcc<3) {
										precio = 12000 + 4000;
									}
									else
										if (numAcc>=3 || numAcc<=4) {
											precio = 12000 + 4000 + 500;
										}
										else
											precio = 12000 + 4000 + 1000;
								break;
			}
						break;
		case 'M':
			switch (material) {
			case "aluminio":	
							if (numAcc<3) {
								precio = 5000 + 2000;
							}
							else 
								if (numAcc>=3 || numAcc<=4) {
									precio = 5000 + 2000 + 500;
								}
								else
									precio = 5000 + 2000 + 1000;
								break;
			case "fibra":
									if (numAcc<3) {
										precio = 5000 + 4000;
									}
									else
										if (numAcc>=3 || numAcc<=4) {
											precio = 5000 + 4000 + 500;
										}
										else
											precio = 5000 + 4000 + 1000;
								break;
			}
						break;
		}
		
		return precio;
	}
	public int calcTiempo() {
		int tiempo = 0;
		switch (material) {
		case "fibra": 
					if (tipo=='U') {
						tiempo = 2;
					}
					else
						tiempo = 3;
					break;
			
		case "aluminio": 
						if (tipo == 'U') {
							tiempo = 1;
						}
						else
							tiempo = 2;
			
					break;
		}
		return tiempo;
	}
	

}
