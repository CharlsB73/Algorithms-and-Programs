package GeneralClasses2;

import java.util.Arrays;

public class Brand {
	private String[] marca;
	private int totMarcas;
	private final int max=200;
	
	public Brand() {
		marca=new String[max];
		totMarcas=0;
		
	}

	public String getMarca(int posMarca) {
		return marca[posMarca];
	}

	public int getTotMarcas() {
		return totMarcas;
	}
	public String toString() {
		return "Marcas:" + Arrays.toString(marca);
	}
	public boolean equals(String marca, int i) {
		return this.marca[i].equalsIgnoreCase(marca);
	}

}
