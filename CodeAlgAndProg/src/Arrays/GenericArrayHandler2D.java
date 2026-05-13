package Arrays; //Programa de CGCC, clave única:208410

public class GenericArrayHandler2D {
	
	//Método que busca la columna donde se encuentra un dato específico
	public static <T> int buscaColumna(T[][] arre,int totCol,T dato,int ren) {
		int i=0;
		while(i<totCol && !arre[ren][i].equals(dato))
			i++;
		if(i==totCol)
			i=-1;
		return i;
	}
	//Método que busca el renglón donde se encuentra un dato específico
	public static <T> int buscaRenglon(T[][] arre,int totRen,T dato,int col) {
		int i=0;
		while(i<totRen && !arre[i][col].equals(dato))
			i++;
		if(i==totRen)
			i=-1;
		return i;
	}
	//Método que imprime la matriz, se proporcionan el número de renglones y de columnas
	public static <T> String imprimirMatriz(T[][] arre,int totRen,int totCol) {
		StringBuilder sB = new StringBuilder();
		for(int i=0;i<totRen;i++)
			for(int j=0;j<totCol;j++)
				if(arre[i][j]!=null)
					sB.append("\n").append(arre[i][j].toString());
		return sB.toString();
	}
	//Regresa el elemento máximo de una columna
	public static <T extends Comparable <T>> int MaxElemCol(T[][]arre,int totRen,int col) {
		T max=arre[0][col];
		int posMax=-1;
		for(int i=0;i<totRen;i++)
			if(arre[i][col].compareTo(max)>=0) {
				max=arre[i][col];
				posMax=i;
			}
		return posMax;
	}
	//Regresa el elemento mínimo de una columna
	public static <T extends Comparable <T>> int MinElemCol(T[][]arre,int totRen,int col) {
		T min=arre[0][col];
		int posMin=-1;
		for(int i=0;i<totRen;i++)
			if(arre[i][col].compareTo(min)<0) {
				min=arre[i][col];
				posMin=i;
			}
		return posMin;
	}
	//Regresa el elemento máximo de un renglón
	public static <T extends Comparable <T>> int MaxElemRen(T[][]arre,int totCol,int ren) {
		T max=arre[ren][0];
		int posMax=-1;
		for(int i=0;i<totCol;i++)
			if(arre[ren][i].compareTo(max)>=0) {
				max=arre[ren][i];
				posMax=i;
			}
		return posMax;
	}
	//Regresa el elemento mínimo de un renglón
	public static <T extends Comparable <T>> int MinElemRen(T[][]arre,int totCol,int ren) {
		T min=arre[ren][0];
		int posMin=-1;
		for(int i=0;i<totCol;i++)
			if(arre[ren][i].compareTo(min)<=0) {
				min=arre[ren][i];
				posMin=i;
			}
		return posMin;
	}
	//Verifica si dos matrices son idpenticas
	public static <T extends Comparable <T>> boolean equalsMatriz(T[][]arre1,int ren1,int col1,T[][]arre2,int ren2,int col2) {
		boolean band=false;
		int i=0,j=0;
		if(ren1==ren2 && col1==col2) {
			band=true;
			while(i<ren1 && band) {
				while(j<col1 && band) {
					if(!arre1[i][j].equals(arre2[i][j]))
						band=false;
					j++;
				}
				i++;
			}
		}
		return band;
	}

	public static void main(String[] args) {
		
	}

}
