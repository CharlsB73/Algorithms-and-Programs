package GeneralClasses;

public class Work {
	private String nomAuto;
	private String nomObra;
	private char tecnica;
	private int anio;
	private double precioB;
	private double alto;
	private double ancho;
	
	public Work() {
		
	}
	
	public Work(String nomAuto, String nomObra, char tecnica, double precioB, double alto, double ancho) {
		this.nomAuto = nomAuto;
		this.nomObra = nomObra;
		this.tecnica = tecnica;
		this.precioB = precioB;
		
	}
	public Work(String nomAuto, String nomObra, char tecnica, double precioB, int anio) {
		this.nomAuto = nomAuto;
		this.nomObra = nomObra;
		this.tecnica = tecnica;
		this.precioB = precioB;
		
	}	
	public Work(String nomAuto, String nomObra) {
		this.nomAuto = nomAuto;
		this.nomObra = nomObra;
	}
	public Work(String nomAuto, char tecnica) {
		this.nomAuto = nomAuto;
		this.tecnica = tecnica;
	}	
	
	public String getNomAuto() {
		return nomAuto;
	}
	

	public String getNomObra() {
		return nomObra;
	}

	public char getTecnica() {
		return tecnica;
	}

	public int getAnio() {
		return anio;
	}

	public double getPrecioB() {
		return precioB;
	}

	public void setPrecio(double nueva) {
		precioB = nueva;
	}
	
	public boolean equals(GeneralClasses.Work otro) {
		boolean resp=false;
		if(this.nomObra.equalsIgnoreCase(nomObra) && this.nomAuto.equalsIgnoreCase(nomAuto))
			resp=true;
		return resp;
	}
	
	public String toString() {
		return "Work nombre del auotr:" + nomAuto + ", nombre de la obra:" + nomObra + ", técnica: " + tecnica + ", anio=" + anio + ", precioB=" + precioB + ", alto=" + alto + ", ancho=" + ancho + "]";
	}

	/*public double calcPrecio(String pintor, double porcentaje) {
		double resultado = 0;
		
		if (ancho*alto > 14000)
			if (tecnica == 'O')
				resultado = precioB + (precioB*0.25) + (precioB*0.1);
			else
				
			if (tecnica == 'A')
				resultado = precioB + (precioB*0.2) + (precioB*0.1);
			else 
				
			if (tecnica == 'G')
				resultado = precioB + (precioB*0.18) + (precioB*0.1);
			else
				
			if (tecnica == 'X')
				resultado = precioB + (precioB*0.18) + (precioB*0.1);
		else
			if (tecnica == 'O')
				resultado = precioB + (precioB*0.25);
			if (tecnica == 'A')
				resultado = precioB + (precioB*0.2);
			if (tecnica == 'G')
				resultado = precioB + (precioB*0.18);
			if (tecnica == 'X')
				resultado = precioB + (precioB*0.18);
		
		return resultado;
	}*/
	public double calcPrecioFinal(String pintor, double porcentaje) {
		double preciofinal;
		preciofinal = precioB;
		
		switch (tecnica) {
		
		case 'O': preciofinal = preciofinal*1.25;
				break;
		case 'A': preciofinal = preciofinal*1.2;
				break;
		case 'G': preciofinal = preciofinal*1.18;
				break;
		default : preciofinal = preciofinal*1.1;
		
		}
		if (ancho*alto>1400)
			preciofinal=preciofinal*1.1;
		if (nomAuto.equals(pintor))
			preciofinal=preciofinal-preciofinal*porcentaje/100;
		return preciofinal;
	}
}
