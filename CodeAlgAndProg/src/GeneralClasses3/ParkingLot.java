package GeneralClasses3;

import GeneralClasses2.Medic;

public class ParkingLot {
	private String nombre;
	private Vehicle [][] vehiculos;
	private final int MAX_PISOS=4;
	private final int MAX_CAJONES=12;
	
	public ParkingLot(String nombre) {
		this.nombre=nombre;
		for(int i=0;i<MAX_PISOS;i++)
			for(int j=0;j<MAX_CAJONES;j++)
				vehiculos[i][j]=null;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int []buscaVehiculo(int placas) {
		int i=0;
		int[]pisoCajon=new int[2];
		boolean band=true;
		Vehicle vehiculo = new Vehicle(placas);
		while(i<MAX_PISOS && band) {
			int j=0;
			while(j<MAX_CAJONES && band) {
				if(vehiculos[i][j].equals(vehiculo)) {
					pisoCajon[0]=i;
					pisoCajon[1]=j;
					band=false;
				}
				j++;
			}
			i++;
		}
		if(i==MAX_PISOS) {
			pisoCajon[0]=-1;
			pisoCajon[1]=-1;
		}
		return pisoCajon;
	}
	public boolean agregaFecha(int placas,int fecha) {
		boolean res=false;
		int[] pos = buscaVehiculo(placas);
		int piso =pos[0],cajon=pos[1];
		if(pos[0]>=0 && pos[1]>=0)
			res=vehiculos[piso][cajon].altaFecha(fecha);
		return res;
	}
	public boolean agregaServicio(int placas,String servicio) {
		boolean res=false;
		int[] pos = buscaVehiculo(placas);
		int piso =pos[0],cajon=pos[1];
		if(pos[0]>=0 && pos[1]>=0)
			res=vehiculos[piso][cajon].altaServicio(servicio);
		return res;
	}
	
	public boolean altaVehiculo(int piso,int cajon,int horaLleg,String marca,int anio,String modelo,int placas,String tipo) {
		boolean res=false;
		if(vehiculos[piso][cajon]==null) {
			res=true;
			
		}
		return res;
	}
}