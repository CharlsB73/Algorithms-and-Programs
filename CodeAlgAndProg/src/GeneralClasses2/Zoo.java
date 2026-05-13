package GeneralClasses2;

import java.util.ArrayList;

public class Zoo {
	private String nombre;
	private String direccion;
	private Animal [] animales;
	private int totAnimales;
	private final int max = 20;
	
	public Zoo() {
		
	}
	
	public Zoo(String nombre, String direccion) {
		this.nombre=nombre;
		this.direccion=direccion;
		animales = new Animal[max];
		totAnimales=0;
	}
	public Zoo(String nombre, String direccion, int max) {
		this.nombre=nombre;
		this.direccion=direccion;
		animales = new Animal[max];
		totAnimales=0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public boolean altaAnimal(String nombre,int edad,String raza,String alimentacion) {
		boolean resp=false;
		
		if(totAnimales<animales.length) {
			resp=true;
			animales[totAnimales] = new Animal(nombre,edad,raza,alimentacion);
			totAnimales++;
		}
		return resp;
	}

	public int promedioEdad() {
		int i,suma = 0,promedio = 0;
		
		for(i=0;i<animales.length;i++)
			suma = suma + animales[i].getEdad();
		promedio = suma/animales.length;
		return promedio;
		
	}
	
	public int cuantosRaza(String nombre) {
		int i=0, contador=0;
		
		//while (i<totAnimales && !animales[i].getNombre().equalsIgnoreCase(nombre))
			
		
		for(i=0;i<totAnimales;i++)
			if(animales[i].getRaza().equalsIgnoreCase(nombre))
				contador++;
		return contador;	
	}
	
	public ArrayList<Integer>edadesDeCiertaRaza(String raza){
		ArrayList<Integer>res=new ArrayList<>();
		for(int i=0;i<totAnimales;i++)
			if(animales[i].getRaza().equalsIgnoreCase(raza))
				res.add(animales[i].getEdad());
		return res;
	}
	
	public boolean ciertoTipoAlimentacion(String alimentacion) {
		boolean res=false;
		int i=0;
		while(res=false)
			if(animales[i].getAlimentacion().equalsIgnoreCase(alimentacion))
				res=true;
			else
				i++;
		return res;
	}

}