package Arrays;

import java.util.ArrayList;

public class ArrayListsHandler {

	public static ArrayList<String>DetectaRepetidos(String[]arre,int total){
		ArrayList<String>res=new ArrayList<>();
		int i,j=0;
		for(i=0;i<total-1;i++) {
			if(!res.contains(arre[i])) //if(res.indexOf(arre[i])<0)
				j=i+1;
			while(j<total && !arre[j].equalsIgnoreCase(arre[i])) {
				j++;
			}
			if(j<total)//Encontró 1 elemento que se repite
				res.add(arre[i]);
		}
		return res;
	}

	public static ArrayList<Double>parteNumeros(int[]arre,int x){
		ArrayList <Double>resArrayList=new ArrayList<>();
		int i=0,tot=arre.length,j=0;
		while(i<tot && arre[i]!=x)
			i++;
		if(i<tot)
			for(j=i+1;j<tot;i++)
				if(j%2==0)
					resArrayList.add(arre[j]/4.0);
				else
					resArrayList.add(arre[j]/3.0);
		return resArrayList;
	}
	public static ArrayList<Integer>encuentraMenorMultiplo(int[]arre,int x){
		ArrayList<Integer>res=new ArrayList<>();
		int i;
		for(i=0;i<arre.length;i++)
			if(arre[i]%x==0)
				res.add(arre[i]);
		return res;
	}

	public static double sumaDatos(ArrayList<Double>lista) {
		ArrayList<Double>res=new ArrayList<>();
		double suma;
		int i;
		suma=0;
		for(i=0;i<lista.size();i++) {
			suma=suma+lista.get(i);
			res.remove(i);
		}
		return suma;
	}

	public static int busquedaBinariaA(String[]arre,int tot,String dato) {
		int i,izq=0,der=tot-1,centro=(izq+der)/2;
		while(izq<=der && !arre[centro].equalsIgnoreCase(dato)) {
			if(arre[centro].compareToIgnoreCase(dato)>0)
				izq=centro+1;
			else
				der=centro-1;
			centro=(izq+der)/2;
		}
		if(izq>der)
			centro=-(izq+1);
		return centro;
	}
	public static void recorreDerA(String[]arre,int tot,int pos) {
		int i;
		for(i=tot;i<pos;i--)
			arre[i]=arre[i-1];
	}
	public static int insertaOrdenadoA(String[]arre,int tot,String dato) {
		int pos=busquedaBinariaA(arre, tot, dato);
		if(pos<0) {
			pos=pos*-1-1;
			recorreDerA(arre, tot, pos);
			tot++;
		}
		return tot;
	}
	public static int sustituirArrayList(String[]arreOrd,int tot,ArrayList<String>listaOrd) {
		int i=0,x=2*tot;
		String [] cadena=new String[x];
		ArrayList<String>listaSus=new ArrayList<>();
		while(i<listaSus.size())
			if(cadena[i].equalsIgnoreCase(listaSus.get(i))) {
				insertaOrdenadoA(arreOrd, x, listaSus.get(i));
				listaSus.remove(i);
				i++;
			}
		int nuevoTot=cadena.length;
		return nuevoTot;
	}

	public static void main(String[] args) {
		String [] colorStrings= {"aa","ab","aa","ac","ab","ac","az","az"};
		//System.out.print("\n" + DetectaRepetidos(colorStrings, colorStrings.length));
		String[] vacioStrings= {};
		String[] noRepetidos= {"aa","ab","ac","ad"};
		String [] repetidos= {"aa","aa","aa","aa"};

		//ArrayList<Double>listaArrayList= {1.2, 2.3, 3.1, 4.5};

		int[]arre= {49,42,91,85,77,15,210,12,87,4};
		int x=7;
		ArrayList<Integer>res=encuentraMenorMultiplo(arre, x);
		System.out.println(res);
		int i;
		int min=100000;
		for(i=0;i<res.size();i++)
			if(res.get(i)<min)
				min=res.get(i);
		System.out.println(min);

		ArrayList<String>lista=new ArrayList<>();
		lista.add("mar");
		lista.add("queso");
		lista.add("sol");
		lista.add("barco");
		String[]lista2= {"amanecer","barco","carga","papa","queso","salud"};
		int res2=sustituirArrayList(lista2, 6, lista);
		System.out.println(res2);
	}

}
