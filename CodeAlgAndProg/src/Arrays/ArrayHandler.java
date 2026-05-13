package Arrays;

import java.util.Scanner;

public class ArrayHandler {

	public static void leeElem (double[] nums, int total, Scanner lee) {
		int i;

		for (i=0; i<total; i++) {
			System.out.println("\nIngresa número double: ");
			nums[i] = lee.nextDouble();
		}
	}

	public static double sumaElem (double [] nums, int total) {
		int i;
		double suma = 0;

		for (i=0; i<total; i++) {
			suma = suma + nums[i];
		}
		return suma;
	}

	public static double promElem (double []nume, int total) {
		int i;
		double promedio = 0;

		promedio = sumaElem(nume, total)/total;
		return promedio;
	}

	public static double mayorElem (double [] numero, int total) {
		int i,indice = -1;
		double max;

		if(total>0) {
			max = numero[0];
			indice = 0;

			for (i=0; i<total; i++) {
				if (numero[i]>max)
					max = numero[i];
				indice = i;
			}
		}
		return indice;
	}

	public static double minElem (double [] num, int total) {
		int i;
		double min;
		min = num[0];

		for (i=0; i<total; i++) {
			if (num[i]<min)
				min = num[i];
		}
		return min;
	}

	public static int cuentaMayoresQue(double[] nums, int total, double promedio) {
		int cont,i;

		cont=0;
		for(i=0; i < total; i++) {
			if (nums[i] > promedio)
				cont++;
		}
		return cont;

	}

	public static int cuentaMenoresQue(double[] numHab, int total, double promedio) {
		int cont,i;

		cont=0;
		for(i=0; i < total; i++) {
			if (numHab[i] < promedio)
				cont++;
		}
		return cont;
	}

	public static int buscaSecuencial(double[] arre, int total, double dato) {
		int i = 0;

		while(i<total && arre[i] != dato)
			i++;
		if(i==total)
			i=-1;

		return i;
	}

	public static int buscaSecuencialString(String[] arre, int total, String dato) {
		int i = 0;

		while(i<total && !arre[i].equals(dato))
			i++;
		if(i==total)
			i=-1;

		return i;
	}

	public static int eliminaDato(double[] arre, int total, double dato) {
		int pos = buscaSecuencial(arre, total, dato);
		if(pos>=0) { //Encontró el dato
			arre[pos] = arre[total-1];
			total = total -1;
		}
		return total;
	}

	public static int eliminaDato2(String[] arre, int total, String dato) {
		int pos = buscaSecuencialString(arre, total, dato);
		if(pos>=0) { //Encontró el dato
			arre[pos] = arre[total-1];
			total = total -1;
		}
		return total;
	}


	public static int moda(int[] num, int total) {
		int m = 0,moda = -1,i;
		int cont = 0, veces = 1;

		for (i=0; i<total; i++) {
			m = num[i];
			cont = 0;
			for(int j=i + 1; j<total; j++) {
				if(num[j]==0)
					cont++;
			}
			if(cont>veces) {
				moda = m;
				veces = cont;
			}
		}
		return moda;
	}

	public static int busquedaBinaria(double[] arre,int n, double dato) {
		int izq = 0;
		int der = n-1;
		int centro = (izq+der)/2;
		while(izq<=der && arre[centro]!=dato) {
			if(arre[centro]>dato)
				der = centro-1;
			else
				izq = centro+1;
			centro = (izq+der)/2;
		}
		if(izq>der)
			centro = -(izq+1);

		return centro;
	}

	public static int busquedaBinariaString(String[] arre,int n, String dato) {
		int izq = 0;
		int der = n-1;
		int centro = (izq+der)/2;
		while(izq<=der && !arre[centro].equals(dato)) {
			if(arre[centro].compareTo(dato)>0)
				der = centro-1;
			else {
				izq = centro+1;
			}
			centro = (izq+der)/2;
		}
		if(izq>der)
			centro = -(izq+1);

		return centro;
	}

	public static void recorreIzqFinal(double[]arre, int tot, int pos) {
		int i;
		for(i=pos;i<tot;i++) {
			arre[i]=arre[i+1];
		}
	}

	public static void recorreDerFinal(double[]arre, int tot, int pos) {
		int i;
		for(i=tot;i>pos;i--) {
			arre[i]=arre[i-1];
		}
	}

	public static void recorreIzqFinalString(String[]arre, int tot, int pos) {
		int i;
		for(i=pos;i<tot;i++) {
			arre[i]=arre[i+1];
		}
	}

	public static void recorreDerFinalString(String[]arre, int tot, int pos) {
		int i;
		for(i=tot;i>pos;i--) {
			arre[i]=arre[i-1];
		}
	}

	public static int insertaOrdenado(double[]arre, int total, double dato) {
		if(total<arre.length) {//Hay espacio
			int pos = busquedaBinaria(arre, total, dato);
			if(pos<0) { //No se repite
				pos=pos*-1-1;
				recorreDerFinal(arre, total, pos);
				arre[pos]=dato;
				total++;
			}
		}
		return total;

	}


	public static int insertaOrdenadoString(String[]arre, int total, String dato) {
		if(total<arre.length) {//Hay espacio
			int pos = busquedaBinariaString(arre, total, dato);
			if(pos<0) { //No se repite
				pos=pos*-1-1;
				recorreDerFinalString(arre, total, pos);
				arre[pos]=dato;
				total++;
			}
		}
		return total;

	}

	public static int eliminaOrdenado(double[]arre, int total, double dato) {
		int pos;
		pos=busquedaBinaria(arre, total, dato);
		if(pos>=0) {//Está en el arreglo
			recorreIzqFinal(arre, total, pos);
			total--;
		}
		return total;
	}


	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);
		int total, moda;
		int[] num = new int [12];
		double contador;
		double promedio;
		double [] nums;
		nums = new double[50];

		do {
			System.out.print("Ingresa total de números: ");
			total = lee.nextInt();
		} while (total <= 0 || total > 50);
		leeElem(nums, total, lee);
		promedio = promElem(nums , total);
		System.out.print("\nEl promedio es = " + promedio);

		contador = cuentaMayoresQue(nums, total, promedio);
		System.out.print("\nEl total de calificaciones > " + promedio + " es = " + contador);


		do {
			System.out.print("Ingresa total de números: ");
			total = lee.nextInt();
		} while (total <= 0 || total > 50);
		leeElem(nums, total, lee);
		moda = moda(num , total);
		System.out.print("\nLa moda es = " + moda);

	}

}
