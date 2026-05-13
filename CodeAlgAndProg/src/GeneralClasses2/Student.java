package GeneralClasses2;

//import Aplicaciones3.Student;
import Arrays.ArrayHandler;

public class Student implements Comparable<Student>{
	private String nomAlumno;
	private String domicilio;
	private double promedio;
	private int curp;
	private String nomCarrera;
	private int totAprobadas;
	private double [] califs;
	private int anioNac;
	private final int max=10;
	
	
	public Student(String nombre, double promedio) {
		this.nomAlumno = nombre;
		this.promedio=promedio;
		califs = new double[max];
		totAprobadas=0;
	}
	//Checar si se debe incluir totAprobadas o no
	public Student(String nombre, String domicilio, int curp, double promedio, String nomCarrera, int anioNac, int max) {
		this.nomAlumno = nombre;
		this.domicilio = domicilio;
		this.curp = curp;
		this.promedio=promedio;
		califs = new double[max];
		totAprobadas=0;
	}
	public Student(String nombre, String domicilio, int curp, String nomCarrera, int anioNac) {
		this.nomAlumno = nombre;
		this.domicilio = domicilio;
		this.curp = curp;
		califs = new double[max];
		totAprobadas=0;
	}
	public int compareTo(Student otro) {
		return this.nomAlumno.compareTo(otro.nomAlumno);
	}
	public boolean equals(Object obj) {
		Student student =(Student)obj;
		return this.nomAlumno.equalsIgnoreCase(student.nomAlumno);
	}
	public String toString() {
		return "\nNombre: " + nomAlumno + "-" + promedio;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getNomCarrera() {
		return nomCarrera;
	}
	public void setNomCarrera(String nomCarrera) {
		this.nomCarrera = nomCarrera;
	}
	public int getTotAprobadas() {
		return totAprobadas;
	}
	public String getNombre() {
		return nomAlumno;
	}
	public int getCurp() {
		return curp;
	}
	public double[] getCalifs() {
		return califs;
	}
	public boolean equals(Student otro) {
		return this.nomAlumno.equalsIgnoreCase(otro.nomAlumno);
	}
	public boolean agregaCalif(double calificacion) {
		boolean resp = false;
		
		if (totAprobadas<califs.length) { //Hay espacio
			califs[totAprobadas]=calificacion;
				resp = true;
			}
		return resp;	
	}
	public double promedio() {
		double promedio = ArrayHandler.promElem(califs, totAprobadas);
		return promedio;
	}
	public int calcEdad() {
		int edad = 2023-anioNac;
		return edad;
	}
}
