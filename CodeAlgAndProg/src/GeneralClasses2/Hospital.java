package GeneralClasses2;

import java.util.ArrayList;

public class Hospital {
	private String nombreH;
	private Medic[] medicos;
	private int totMedicos;
	private final int max=50;
	
	public Hospital() {
		
	}
	public Hospital(String nombreH) {
		this.nombreH=nombreH;
		medicos = new Medic[max];
		totMedicos=0;
	}
	public Hospital(String nombreH,int max) {
		this.nombreH=nombreH;
		medicos = new Medic[max];
		totMedicos=0;
	}
	
	public String getNombreH() {
		return nombreH;
	}
	public Medic[] getMedicos() {
		return medicos;
	}
	private int buscaPorClave(int clave) {
		int i=0;
		while(i<totMedicos && medicos[i].getClave()!=clave) {
			i++;
		}
		if(i==totMedicos)
			i=-1;
		return i;
	}
	public boolean altaMedico(String nombre, int clave) {
		boolean resp=false;
		
		if(totMedicos<medicos.length) {
			resp=true;
			medicos[totMedicos] = new Medic(nombre,clave);
			totMedicos++;
		}
		return resp;
	}
	private int buscaMedico(int clave) {
		int i=0;
		Medic medico = new Medic(clave);
		while(i<totMedicos && !medicos[i].equals(medico))
			i++;
		if(i==totMedicos)
			i=-1;
		return i;
	}
	
	public boolean agregaEspecialidadMedico(int clave,String especialidad) {
		boolean res=false;
		int pos = buscaMedico(clave),i;
		if(pos>=0)
			res=medicos[pos].altaEspecialidad(especialidad);
		return res;
	}
	
	public int numMedEspX(String esp) {
		int i,cont;
		
		cont=0;
		for(i=0;i<totMedicos;i++)
			if(medicos[i].busquedaEspecialidad(esp)>=0)
				cont++;
		return cont;
	}
	
	public ArrayList<String>especialidadesMedX(int clave){
		ArrayList<String>res=new ArrayList<>();
		int i=buscaMedico(clave);
		if(i>=0)
			//int tot = medicos[i].getTotEspecialidades();
			for(int j=0;j<medicos[i].getTotEspecialidades();i++)
				res.add(medicos[i].getEspecialidad(j));
				
		return res;
	}
}
