package GeneralClasses3; //Programa de CGCC, clave única:208410

public class MAG {
	//Búsqueda secuencial
	public static <T> int buscaSecuencial(T[] arre,int total,T dato) {
		int i=0;
		while(i<total && !arre[i].equals(dato))
			i++;
		if(i==total)
			i=-1;
		return i;
	} 
	//Método que recorre a la izquierda elementos a partir de una posición 
	public static <T> void recorreIzq(T[]arre,int total,int pos) {
		for(int i=pos;i<total;i++)
			arre[i]=arre[i+1];
	}
	//Método que recorre a la derecha elementos a partir de una posición 
	public static <T> void recorreDer(T[]arre,int total,int pos) {
		for(int i=total;i>pos;i--)
			arre[i]=arre[i-1];
	}
	//Búsqueda binaria
	public static <T extends Comparable<T>> int buscaBinaria(T[]arre,int total,T dato) {
		int izq=0,der=total-1,cen=(izq+der)/2;
		while(izq<=der && !arre[cen].equals(dato)) {
			if(arre[cen].compareTo(dato)>0)
				der=cen-1;
			else
				izq=cen+1;
			cen=(izq+der)/2;
		}
		if(izq>der)
			cen=-(izq+1);
		return cen;
	}
	//Método que usa la búsqueda binaria para insertar un elemento en un arreglo ordenado
	public static <T extends Comparable<T>> int insertaOrdenado(T[]arre,int total,T dato) {
		if(total<arre.length) {
			int pos;
			pos=buscaBinaria(arre, total, dato);
			if(pos<0) {
				pos=(pos*-1)-1;
				recorreDer(arre, total, pos);
				arre[pos]=dato;
				total++;
			}
		}
		return total;
	}
	//Método que usa la búsqueda binaria para quitar un elemento en un arreglo ordenado
	public static <T extends Comparable<T>> int bajaOrdenado(T[]arre,int total,T dato) {
		int pos=buscaBinaria(arre, total, dato);
		if(pos<0) {
			pos=(pos*-1)-1;
			recorreIzq(arre, total, pos);
			total--;
		}
		return total;
	}
	//Ordenación por Selección Directa
	public static <T extends Comparable<T>> void ordenaSelDir(T[]arre,int total) {
		int i,j,pos;
		T menorT;
		for(i=0;i<total-1;i++) {
			menorT=arre[i];
			pos=i;
			for(j=i+1;j<total;j++)
				if(arre[j].compareTo(menorT)<0) {
					menorT=arre[j];
					pos=j;
				}
			arre[pos]=arre[i];
			arre[i]=menorT;
			
		}
	}
	//Métpdp que imprime el arreglo mandando llamar los métodos toString
	public static <T> String impArre(T[]arre,int n) {
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=0;i<n;i++)
			stringBuilder.append(arre[i]).append("\n");
		return stringBuilder.toString();
	}

}
