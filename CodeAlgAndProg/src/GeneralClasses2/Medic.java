package GeneralClasses2;

import java.util.ArrayList;

public class Medic {
	private String nombreM;
	private String [] especialidad;
	private int totEspecialidades;
	private final int max=5;
	private int clave;
	
	public Medic() {
		especialidad=new String[max];
		totEspecialidades=0;
	}
	public Medic(String nombre, int clave) {
		this.nombreM=nombre;
		this.clave=clave;
		especialidad=new String[max];
		totEspecialidades=0;
	}
	public Medic(String nombre, int clave, int max) {
		this.nombreM=nombre;
		this.clave=clave;
		especialidad=new String[max];
		totEspecialidades=0;
	}
	public Medic(int clave) { //Apoyo para la búsqueda en el Hospital
		this.clave=clave;
		especialidad=new String[max];
		totEspecialidades=0;
	}
	public String getNombre() {
		return nombreM;
	}
	
	public String getEspecialidad(int n) {
		return especialidad[n];
	}
	public int getTotEspecialidades() {
		return totEspecialidades;
	}
	public ArrayList<String> getEspecialidades() {
		int i;
		ArrayList<String> res = new ArrayList<>();
		for(i=0;i<especialidad.length;i++)
			res.add(especialidad[i]);		
		return res;
	}
	public int getClave() {
		return clave;
	}
	public boolean equals(GeneralClasses2.Medic otro) {
		return this.nombreM.equalsIgnoreCase(otro.nombreM);
	}
	public int compareTo(GeneralClasses2.Medic otro) {
		return this.clave-otro.clave;
	}
	public String toString() {
		return "Nombre: " + nombreM + "\nEspecialidad: " + especialidad + "\nClave: " + clave;
	}
	
	public int busquedaEspecialidad(String esp) {
		int izq=0,der=totEspecialidades-1;
		int centro=(izq+der)/2;
		
		while(izq<=der && !esp.equalsIgnoreCase(especialidad[centro])) {
			if(especialidad[centro].compareToIgnoreCase(esp)>0)
				der=centro-1;
			else
				izq=centro+1;
			centro=(izq+der)/2;
		}
		if(izq>der)
			centro= -1*(izq+1);
		return centro;
	}
	private void recorreDer(int pos) {
		int i;
		for(i=totEspecialidades;i>pos;i--) {
			especialidad[i]=especialidad[i-1];
		}
	}
	
	public boolean altaEspecialidad(String esp) {
		boolean resp=false;
		if(totEspecialidades<especialidad.length) {
			int pos=busquedaEspecialidad(esp);
			if(pos<0) {
				pos=pos*-1-1;
				recorreDer(pos);
				especialidad[pos]=esp;
				totEspecialidades++;
				resp=true;
			}
		}
		return resp;
	}

}
