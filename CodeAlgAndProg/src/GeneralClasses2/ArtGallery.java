package GeneralClasses2;

import java.util.ArrayList;

import GeneralClasses.Work;

public class ArtGallery {
	private String nombre;
	private int telefono;
	private Work[] datosObras;
	private int totObras;
	private final int max = 100;
	
	public ArtGallery() {
		
	}
	public ArtGallery(String nombre, int telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
		datosObras=new Work[max];
		totObras=0;
	}
	public ArtGallery(String nombre, int telefono, int max) {
		this.nombre=nombre;
		this.telefono=telefono;
		datosObras=new Work[max];
		totObras=0;
	}
	public String getNombreGaleria() {
		return nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getObras() {
		StringBuilder sB = new StringBuilder();
		int i;
		for(i=0;i<totObras; i++)
			sB.append(datosObras[i].toString());
		return sB.toString();
	}
	public boolean altaObra(String nomAuto, String nomObra, char tecnica, double precioB, int anio) {
		boolean resp=false;
		
		if(totObras<datosObras.length) {
			resp=true;
			datosObras[totObras] = new Work(nomAuto,nomObra,tecnica,precioB,anio);
			totObras++;
		}
		return resp;
	}
	public int buscaAutorObraString(String nomAuto,String nomObra) {
		int i=0,pos;

		Work x = new Work(nomAuto,nomObra);
		while(i<totObras && !datosObras[i].equals(x)) {
			i++;
		}
		if(i<totObras)
			pos=i;
		else
			pos=-1;
		return pos;
	}
	
	public boolean bajaObra(String nomAutor,String nomObra) {
		boolean resp=false;
		int pos=buscaAutorObraString(nomAutor,nomObra);
		if(pos>=0) {
			datosObras[pos] = datosObras[totObras-1];
			datosObras[totObras-1] = null;
			totObras--;
		}
		return resp;
	}
	public int buscaAutorObraChar(String nomAuto,char tecnica) {
		int i=0,pos;

		Work x = new Work(nomAuto,tecnica);
		while(i<totObras && !datosObras[i].equals(x)) {
			i++;
		}
		if(i<totObras)
			pos=i;
		else
			pos=-1;
		return pos;
	}
	public ArrayList<String>consultaPorPintorTecnica(String nomAuto,char tecnica) {
		ArrayList<String> res = new ArrayList<>();
		int i,cont=0;
		//int pos=buscaAutorObraChar(nomAuto, tecnica);
		for(i=0;i<totObras;i++)
			if(datosObras[i].getNomAuto().equals(nomAuto) && datosObras[i].getTecnica()==(tecnica))
				res.add(datosObras[i].getNomObra());
			else
				cont++;
		if(cont==totObras)
			res=null;
		return res;
	}
	public boolean consultaPorPrecio(double precioB) {
		int i=0;
		boolean resp=false;
		while(i<totObras-1 && datosObras[i].getPrecioB()>=precioB) {
			i++;
		}
		if(i!=totObras-1)	
			resp=true;
		return resp;
	}
}