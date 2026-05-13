package GeneralClasses3;
//SI TUVIERA QUE COMPARAR PORTAFOLIOS, TAMBIÉN
//NECESITO EL IMPLEMENTS
public class PortafolioInvestment {
	private String nombre;
	private Investment[]inversiones;
	private int totInv;
	private final int MAX_INV=100;
	
	public PortafolioInvestment(String nombre) {
		this.nombre = nombre;
		inversiones = new Investment[MAX_INV];
		totInv = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Investment getInversiones(int pos) {
		return inversiones[pos];
	}
	public int getTotInv() {
		return totInv;
	}
	public String toString() {
		StringBuilder sB=new StringBuilder();
		for(int i=0;i<totInv;i++)
			sB.append("\n").append(inversiones.toString());
		return "Portafolio: "+nombre+sB.toString();
	}
	public boolean equals(Object obj) {
		GeneralClasses3.PortafolioInvestment x=(GeneralClasses3.PortafolioInvestment)obj;
		if(nombre.equals(x.nombre))
			return true;
		else
			return false;
	}
	public int compareTo(GeneralClasses3.PortafolioInvestment otro) {
		return this.nombre.compareTo(otro.nombre);
	}
	public int altaInversion(String nombre,double monto,int plazo,int rendimiento) {
		Investment x=new Investment(nombre, monto, plazo, rendimiento);
		totInv=MAG.insertaOrdenado(inversiones, totInv, x);
		return totInv;
	}
	public boolean buscaInversion(String nombre) {
		int pos=MAG.buscaBinaria(inversiones, totInv, new Investment(nombre));
		if(pos>=0)
			return true;
		else
			return false;
	}
	public int cuantasInvMayorA(double monto) {
		int cont=0;
		for(int i=0;i<totInv;i++)
			if(inversiones[i].getMonto()>monto)
				cont++;
		return cont;
	}

}
