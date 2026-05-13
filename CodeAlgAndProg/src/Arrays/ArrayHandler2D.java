package Arrays;

public class ArrayHandler2D {
	
	public static double sumaRenglon(double[][] arre,int ren,int totCol) {
		double suma=0;
		int i;
		for(i=0;i<totCol;i++) {
			suma+=arre[ren][i]; //suma = suma + arre...
		}
		return suma;
	}
	public static double sumaColumna(double[][] arre,int col,int totRen) {
		double suma=0;
		int i;
		for(i=0;i<totRen;i++) {
			suma+=arre[i][col]; //suma = suma + arre...
		}
		return suma;
	}
	public static double sumaArreglo(double[][] arre,int totRen,int totCol) {
		double suma=0;
		int i,j;
		for(i=0;i<totRen;i++) {
			for(j=0;j<totCol;j++)
				suma+=arre[i][j];
		}
		return suma;
	}
	public static double sumaDiagonal(double[][] arre) {
		double suma=0;
		int i=0,j=0;
		while(arre[i][i]<arre.length && arre[i][i]<arre[0].length) {
			suma+=arre[i][j];
			i++;
		}
		return suma;
	}
	public static double sumaDiagonal2(double[][] arre,int total) {
		double suma=0;
		int i;
		for(i=0;i<total;i++)
			suma+=arre[i][i];
		return suma;
	}
	public static double sumaDiagonalInversa(double[][] arre,int tot) {
		double suma=0;
		int i=0,c;
		for(c=tot-1;c>=0;c--) {
			suma+=arre[tot-1-c][i];
		}
		return suma;
	}
	public static String toStringArre(double[][] arre,int totRen,int totColum) {
		StringBuilder sB = new StringBuilder();
		int i,j;
		for(i=0;i<totRen;i++) {
			for(j=0;j<totColum;j++)
				sB.append(arre[i][j] + " ");
			sB.append("\n");
		}
		return sB.toString();
	}
	public static int [] posElementoMaxCol(double[][]arre,int colum,int totRen) {
		int [] arreglo = {-1,colum};
		int i;
		double max=-10;
		for(i=0;i<totRen;i++)
			if(arre[i][colum]>max) {
				max=arre[i][colum];
				arreglo[0]=i;
			}
		return arreglo;
	}
	public static String posElementoMinCol(double[][]arre,int colum,int totRen) {
		StringBuilder sB = new StringBuilder();
		int i;
		double min=999999;
		int posRen=0;
		for(i=0;i<totRen;i++)
			if(arre[i][colum]<min) {
				min=arre[i][colum];
				posRen=i;
			}
		sB.append("(" + posRen + "," + colum + ")");
		return sB.toString();
	}
	public static String posElementoMaxRen(double [][] arre,int ren,int totColum) {
		StringBuilder sB = new StringBuilder();
		int i;
		double max=-10;
		int posCol=0;
		for(i=0;i<totColum;i++)
			if(arre[ren][i]>max) {
				max=arre[ren][i];
				posCol=i;
			}
		sB.append("(" + ren + "," + posCol + ")");
		return sB.toString();
	}
	public static String posElementoMinRen(double[][]arre,int ren,int totColum) {
		StringBuilder sB = new StringBuilder();
		int i;
		double min=999999;
		int posCol=0;
		for(i=0;i<totColum;i++)
			if(arre[ren][i]<min) {
				min=arre[ren][i];
				posCol=i;
			}
		sB.append("(" + ren + "," + posCol + ")");
		return sB.toString();
	}
	public static int suma2Matrices(int [][]arre1,int totRenA1,int totColA1,int [][]arre2,int totRenA2,int totColA2){
		int totRen,totCol,i,j;
		int suma=0;
		int [][] arre=new int [totRenA1*totRenA2][totColA1*totColA2];
		if(totRenA1<totRenA2)
			totRen=totRenA1;
		else
			totRen=totRenA2;
		if(totColA1<totColA2)
			totCol=totColA1;
		else
			totCol=totColA2;
		for(i=0;i<totRen;i++)
			for(j=0;j<totCol;j++)
				suma+=arre1[i][j]+arre2[i][j];
		return suma;
	}
	public static double[][] sumaArreglos(double [][]arre1,int totRenA1,int totColA1,double [][]arre2,int totRenA2,int totColA2){
		double [][] arre=new double [totRenA1][totColA1];
		if(totRenA1==totRenA2 && totColA1==totColA2 && totRenA1>0 && totColA1>0)
				for(int i=0;i<totRenA1;i++)
					for(int j=0;j<totColA1;j++)
						arre[i][j]+=arre1[i][j]+arre2[i][j];
		return arre;
	}
	public static int multiplicacion2Matrices(int [][]arre1,int totRenA1,int totColA1,int [][]arre2,int totRenA2,int totColA2){
		int totRen,totCol,i,j;
		int multiplicacion=0;
		int [][] arre=new int [totRenA1*totRenA2][totColA1*totColA2];
		if(totRenA1<totRenA2)
			totRen=totRenA1;
		else
			totRen=totRenA2;
		if(totColA1<totColA2)
			totCol=totColA1;
		else
			totCol=totColA2;
		for(i=0;i<totRen;i++)
			for(j=0;j<totCol;j++)
				multiplicacion+=arre1[i][j]*arre2[i][j];
		return multiplicacion;
	}
	public static double [][] multiplicacionArreglos(double [][]arre1,int totRenA1,int totColA1,double [][]arre2,int totRenA2,int totColA2){
		int r=0,a=0;
		double [][] arre=new double [totRenA1][totColA1];
		if(totColA1==totRenA2) {
			while(r<totRenA1) {
				double multiplicacion=0;
				for(int j=0;j<totColA2;j++)
					multiplicacion+=arre1[r][j]*arre2[r][a];
				arre[r][a]=multiplicacion;
				if(a<totColA2)
					a++;
				if(a==totColA2) {
					a=0;
					r++;
				}
			}
		}
		return arre;
	}
	public static double [][] genTraspuesta(double[][] arre1,int ren,int col){
		double[][] arre=new double [col][ren];
		for(int i=0;i<ren;i++)
			for(int j=0;j<col;i++)
				arre[j][i]=arre1[i][j];
		return arre;
	}
	public static boolean esSimetrica(double[][] matriz,int total) {
		boolean res=true;
		int i,j;
		i=0;
		while(i<total && res) {
			j=i+1;
			while(j<total && res) {
				if(matriz[i][j]!=matriz[j][i])
					res=false;
				else
					j++;
			}
		i++;
		}
		return res;
	}
	public static boolean esSimetrica2(double[][] matriz,int ren,int col) {
		boolean res=true;
		double[][] trasp=genTraspuesta(matriz, ren, col);
		int i;
		i=0;
		if(ren==col&&ren>0&&col>0) {
			while(res&&i<ren) {
				for(i=0;i<ren;i++)
					for(int j=0;j<col;j++)
						if(matriz[i][j]!=trasp[i][j])
							res=false;
			}
		}
		else
			res=false;
		return res;
	}
	public static boolean esIdentidad2(double[][] arre,int ren,int col,int tot) {
		boolean band=true;
		while(ren<tot && band) {
			col=0;
			while(col<tot && band) {
				if(ren==col) {
					if(arre[ren][col]!=1)
						band=false;
				}
				else
					if(arre[ren][col]!=0)
						band=false;
				col++;
			}
			ren++;
		}
		return band;
	}
	public static boolean esIdentidad3(double[][] arre,int ren,int col,int tot) {
		boolean band=true;
		int res=0;
		while(ren<tot && band) {
			col=0;
			while(col<tot && band) {
				if(ren==col) {
					if(arre[ren][col]!=1)
						band=false;
				}
				else
					if(arre[ren][col]!=0)
						band=false;
				col++;
			}
			ren++;
		}
		return band;
	}

	public static void main(String[] args) {
		double [][] m1= {{2,3,4},{5,6,7},{8,9,10}};
		
		System.out.println(sumaRenglon(m1, 1, 3));
		System.out.println(sumaColumna(m1, 0, 2));
		System.out.println(sumaArreglo(m1, 3, 3));
		System.out.println(sumaDiagonal(m1));
		System.out.println(sumaDiagonalInversa(m1, 3));
		System.out.println(toStringArre(m1, 1, 3));
		
		System.out.println(posElementoMaxRen(m1, 1, 3));
		System.out.println(posElementoMinRen(m1, 1, 3));
		
		System.out.println(posElementoMaxCol(m1, 1, 3));
		System.out.println(posElementoMinCol(m1, 1, 3));

	}

}
