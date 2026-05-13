package GeneralClasses3;

public class Vehicle {
	//private int piso;
	//private int cajon;
	//private int horaLlegada;
	private String marca;
	private int anio;
	private String modelo;
	private int placas;
	private String tipo; //moto,SUV,carro
	private int [] fechas;
	private int totFechas;
	private final int MAX_MESES=12;
	private String [] servicios;
	private int totSer;
	private final int MAX_SER=4;
	
	public Vehicle(int placas) {
		this.placas=placas;
	}
	public Vehicle(String marca,int anio,String modelo,int placas,String tipo) {
		this.marca=marca;
		this.anio=anio;
		this.modelo=modelo;
		this.placas=placas;
		this.tipo=tipo;
		fechas=new int[MAX_MESES];
		totFechas=0;
		servicios=new String[MAX_SER];
		totSer=0;
	}
	public int getPlacas() {
		return placas;
	}
	public void setPlacas(int placas) {
		this.placas = placas;
	}
	public String getMarca() {
		return marca;
	}
	public int getAnio() {
		return anio;
	}
	public String getModelo() {
		return modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public int getTotFechas() {
		return totFechas;
	}
	public int getTotSer() {
		return totSer;
	}
	public String getServicios(int n) {
		return servicios[n];
	}
	public String toString() {
		return "Vehiculo marca=" + marca + ", anio=" + anio + ", modelo=" + modelo + ", placas=" + placas + ", tipo="
				+ tipo;
	}
	public boolean equals(Object obj) {
		Vehicle otro=(Vehicle)obj;
		return this.placas==otro.placas;
	}
	public int compareTo(Vehicle otro) {
		return this.placas-otro.placas;
	}
	public int busquedaSecuencial(int[]arre,int total,int dato) {
		int i=0,pos=-1;
		while(i<total && arre[i]!=dato)
			i++;
		pos=i;
		return pos;
	}
	public void recorreIzq(int[]arre,int total,int pos) {
		for(int i=pos;i<total;i++)
			arre[i]=arre[i+1];
	}
	public void recorreDer(int[]arre,int total,int pos) {
		for(int i=total-1;i>pos;i--)
			arre[i]=arre[i-1];
	}
	public int busquedaSecuencialString(String[]arre,int total,String dato) {
		int i=0,pos=-1;
		while(i<total && !arre[i].equals(dato))
			i++;
		pos=i;
		return pos;
	}
	public void recorreIzqString(String[]arre,int total,int pos) {
		for(int i=pos;i<total;i++)
			arre[i]=arre[i+1];
	}
	public void recorreDerString(String[]arre,int total,int pos) {
		for(int i=total-1;i>pos;i--)
			arre[i]=arre[i-1];
	}
	public boolean altaFecha(int fecha) {
		boolean res=false;
		if(fechas.length<MAX_MESES) {
			res=true;
			fechas[totFechas]=fecha;
			totFechas++;
		}
		return res;
	}
	public boolean bajaFecha(int fecha) {
		boolean res=false;
		if(fecha>0) {
			res=true;
			int pos= busquedaSecuencial(fechas, totFechas, fecha);
			recorreIzq(fechas, fecha, pos);
			totFechas--;
		}
		return res;
	}
	public boolean altaServicio(String servicio) {
		boolean res=false;
		if(servicios.length<MAX_SER) {
			res=true;
			servicios[totSer]=servicio;
			totSer++;
		}
		return res;
	}
	public boolean bajaServicio(String servicio) {
		boolean res=false;
		if(servicio!=null) {
			res=true;
			int pos=busquedaSecuencialString(servicios, totSer, servicio);
			recorreIzqString(servicios, totSer, pos);
			totFechas--;
		}
		return res;
	}

}
