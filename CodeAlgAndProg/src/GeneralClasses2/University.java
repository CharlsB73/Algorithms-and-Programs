package GeneralClasses2;

import Arrays.ArrayHandler;
import GeneralClasses2.Student;

public class University {
	private String nombre;
	private String direccion;
	private String codPostal;
	private Student [] listaAlumnos;
	private int totAlumnos;
	private final int max=100;
	
	public University() {
		listaAlumnos = new Student[max];
		totAlumnos = 0;
	}
	public University(String nombre, String direccion, String codPostal) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
		listaAlumnos = new Student[max];
		totAlumnos = 0;
	}
	public University(String nombre, String direccion, String codPostal, int max) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
		listaAlumnos = new Student[max];
		totAlumnos = 0;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public int getTotAlumnos() {
		return totAlumnos;
	}
	public boolean altaAlumno(String nombre, String domicilio, int curp, String nomCarrera, int anioNac) {
		boolean resp=false;
		
		if(totAlumnos<listaAlumnos.length) {
			resp=true;
			listaAlumnos[totAlumnos] = new Student(nombre,domicilio,curp,nomCarrera,anioNac);
			totAlumnos++;
		}
		return resp;
	}
	//SIEMPRE SE BUSCA CON WHILE
	private int buscaPorNombre(String nom) {
		int i=0;
		while(i<totAlumnos && !listaAlumnos[i].getNombre().equalsIgnoreCase(nom)) {
			i++;
		}
		if(i==totAlumnos)
			i=-1;
		return i;
	}
	public boolean altaCalificacion(String nom, int calif) {
		boolean resp=false;
		int pos;
		pos=buscaPorNombre(nom);
		if(pos>=0)
			resp = listaAlumnos[pos].agregaCalif(calif);
		return resp;
	}
	public boolean cambiaDom(String domicilio, String nuevodom) {
		boolean resp = false;
		int pos=buscaPorNombre(domicilio);
		if(pos>=0)
			listaAlumnos[pos].setDomicilio(nuevodom);
			resp=true;
		return resp;
	}
	public boolean quitarAlumno(String nom) {
		boolean resp=false;
		int pos=buscaPorNombre(nom);
		if(pos>=0) {
			listaAlumnos[pos] = listaAlumnos[totAlumnos-1];
			listaAlumnos[totAlumnos-1] = null;
			totAlumnos--;
		}
		return resp;
	}
	public String toStringDatosAlumnos() {
		StringBuilder sB = new StringBuilder();
		int i;
		sB.append("\nUniversity: " + nombre);
		sB.append("\nDatos de los alumnos: \n");
		for(i=0;i<totAlumnos;i++) {
			sB.append(listaAlumnos[i].getCurp()).append(listaAlumnos[i].getNombre()).append(listaAlumnos[i].getTotAprobadas()).append(listaAlumnos[i].getNomCarrera());
		}
		return sB.toString();
	}
	public String toStringDatosAlumnosMayores(int edad) {
		StringBuilder sB = new StringBuilder();
		int i;
		sB.append("\nUniversity: " + nombre);
		sB.append("\nDatos de los alumnos: \n");
		for(i=0;i<totAlumnos;i++) {
			if(listaAlumnos[i].calcEdad() > edad)
				sB.append("\nAlberca nro " + (i+1) + ("\n") + listaAlumnos[i]).append("\n");
		}
		return sB.toString();
	}
}
