package ProyectoAgenciaFenix; //Programa de CGCC, clave única:208410

//Importar ArrayList
import java.util.ArrayList;

import Arrays.ArrayHandler2D;
import Arrays.GenericArrayHandler2D;
import GeneralClasses3.MAG;

//Clase: se incluye el Comparable, por si se quieren comparar más agencias en el futuro
public class Agencia implements Comparable<Agencia>{
	
	//Atributos
	private String nombre;
	private String direccion;
	private Terreno[] terrenos;
	private int totTerrenos;
	private final int MAXT=20;
	private Casa [] []casas;
	private final int MAXCAT=5;
	private final int MAXCASAS=10;
	private int [] totCasas;
	
	//Constructores: el segundo incluye los máximos como parámetros
	public Agencia(String nombre,String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		terrenos=new Terreno[MAXT];
		totTerrenos=0;
		casas=new Casa[MAXCAT][MAXCASAS];
		totCasas=new int [MAXCASAS];
		for(int i=0;i<MAXCAT;i++) {
			totCasas[i]=0;
			for(int j=0;j<MAXCASAS;j++)
				casas[i][j]=null;
		}
	}
	public Agencia(String nombre,String direccion,int maxT,int maxC,int maxCat) {
		this.nombre=nombre;
		this.direccion=direccion;
		terrenos=new Terreno[maxT];
		totTerrenos=0;
		casas=new Casa[maxCat][maxC];
		totCasas=new int [maxC];
		for(int i=0;i<MAXCAT;i++) {
			totCasas[i]=0;
			for(int j=0;j<MAXCASAS;j++)
				casas[i][j]=null;
		}
	}
	//Funcionalidad mínima: get,set,equals,compareTo,toString
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public Terreno getTerrenos(int n) {
		return terrenos[n];
	}
	public int getTotTerrenos() {
		return totTerrenos;
	}
	public Casa getCasa(int i,int j) {
		return casas[i][j];
	}
	public int getTotCasasCat(int cat) {
		return totCasas[cat];
	}
	//Un equals que compara la clase Objeto
	public boolean equals(Object obj) {
		Agencia otra=(Agencia)obj;
		return this.nombre==otra.nombre;
	}
	public int compareTo(Agencia otro) {
		return this.nombre.compareToIgnoreCase(otro.nombre);
	}
	
	
//Métodos de Casa:
	
	//Método que define la categoría de las casas a partir del precio
	public int definirCategoria(double precio) {
	    int cat;
	    if (precio >= 2000000.0 && precio < 2500000.0)
	        cat = 0;
	    else if (precio >= 2500000.0 && precio < 3000000.0)
	        cat = 1;
	    else if (precio >= 3000000.0 && precio < 3500000.0)
	        cat = 2;
	    else if (precio >= 3500000.0 && precio < 4000000.0)
	        cat = 3;
	    else if (precio >= 4000000.0 && precio < 6000000.0)
	        cat = 4;
	    else
	        cat = -1;
	    return cat;
	}
	/*
	 * Este método de búsqueda binaria en matriz funciona porque se fija la casilla en el eje y
	 * a partir de que define la categoría gracias al método anterior. Se ordena de menor a mayor
	 * con respecto al precio
	 */
	public int busquedaCasaBinaria(double precio) {
		int cat=definirCategoria(precio);
		if(cat>-1) {
			int izq=0,der=totCasas[cat]-1; //totCasas[cat]-1
			int centro=(izq+der)/2;
			
			while(izq<=der && casas[cat][centro].getPrecio()!=precio) {
				if(precio < casas[cat][centro].getPrecio()) //>
					der=centro-1;
				else
					izq=centro+1;
				centro=(izq+der)/2;
			}
			if(izq>der)
				centro= -1*(izq+1);
			return centro;
		}
		else
			return -1;
	}
	//Un método que recorre los elementos de una categoría a la derecha, a partir de una posición
	private void recorreDerCasa(int pos,int cat) {
		for(int i=totCasas[cat];i>pos;i--) {
			casas[cat][i]=casas[cat][i-1];
		}
	}
	//Una Alta que ocupa todos los métodos anteriores para tener ordenadas las casas por los precios
	public boolean altaCasa(double m2,double precio,int banios,int recamaras,int cajonesEst) {
		boolean resp=false;
		int cat=definirCategoria(precio);
		if(totCasas[cat]<MAXCASAS) {//probable problema
			int pos=busquedaCasaBinaria(precio);
			if(pos<0) {
				pos=pos*-1-1;
				recorreDerCasa(pos,cat);
				casas[cat][pos]=new Casa(m2, precio, banios, recamaras, cajonesEst);
				totCasas[cat]++;
				resp=true;	
			}
		}
		return resp;
	}
	private void recorreIzqCasa(int pos,int cat) {
		for(int i=pos;i<totCasas[cat];i++) {
			casas[cat][i]=casas[cat][i+1];
		}
	}
	// Una baja que busca a un Objeto Casa y lo ordena
	public boolean bajaCasa(double precio) {
		boolean resp=false;
		int cat=definirCategoria(precio);
		int pos=busquedaCasaBinaria(precio);
		if(pos>=0) {
			recorreIzqCasa(pos, cat);
			int indice=totCasas[cat]-1;
			casas[cat][indice]=null;
			totCasas[cat]--;
			resp=true;
		}
		return resp;
	}
	//toString de las casas usando un método genérico bidimensional
	public String casasToString() {
		String x= GenericArrayHandler2D.imprimirMatriz(casas, MAXCAT, MAXCASAS);
		return "Agencia "+nombre+"\n"+x;
	}
	//Método que devuelve una cadena a partir de una categoría que se ingrese
	public String infoCasasEnCategoria(int cat) {
		StringBuilder sB = new StringBuilder();
		for(int i=0;i<totCasas[cat];i++) {
			sB.append(casas[cat][i].toString()).append("\n");
		}
		return sB.toString();
	}
	//Un método que permite saber cuántas casas hay en cada categoría
	public int []contCasas() {
		int arre[]=new int[MAXCAT];
		for(int i=0;i<MAXCAT;i++)
			arre[i]=totCasas[i];
		return arre;
	}
	
	
//Métodos de Terreno:	

	//Da de alta un terreno ordenado usando un método genérico
	public int altaTerreno(double costo,double m2) {
		Terreno x=new Terreno(costo, m2);
		totTerrenos=MAG.insertaOrdenado(terrenos, totTerrenos, x);
		return totTerrenos;
	}
	//Da de baja un terreno usando un método genérico
	public int bajaTerreno(double costo,double m2) {
		Terreno x=new Terreno(costo, m2);
		totTerrenos=MAG.bajaOrdenado(terrenos, totTerrenos, x);
		return totTerrenos;
	}
	//ArrayList de terrenos
	public ArrayList<String> terrenosArrayList() {
		ArrayList<String>x=new ArrayList<>();
		x.add("\nAgencia Fénix\n");
		for(int i=0;i<totTerrenos;i++) {
			x.add(terrenos[i].toString());
			x.add("\n");
		}
		return x;
	}
	//El método regreesa una cadena de la información de un terreno a partir del precio ingresado
	public String infoTerrenoEnParametro(double precio) {
		StringBuilder sB = new StringBuilder();
		int i;
		for(i=0;i<totTerrenos;i++) {
			if(terrenos[i].getCosto()==precio)
				sB.append(terrenos[i].toString()).append("\n");
		}
		return "\n"+sB.toString();
	}

}
