package GeneralClasses3;

public class Serpentario {
	private Serpiente [][]serpientes;
	private final int MAX_TIPO=20;
	private final int MAX_CANT=30;
	private int [] totSer;
	
	public Serpentario() {
		serpientes=new Serpiente[MAX_TIPO][MAX_CANT];
		totSer=new int[MAX_TIPO];
		for(int i=0;i<MAX_TIPO;i++) {
			totSer[i]=0;
			for(int j=0;j<MAX_CANT;j++)
				serpientes[i][j]=null;
		}
	}
	public boolean altaSerpiente(String nombre,int clave,String alimentacion,int tipo) {
		boolean resp=false;
		if(tipo>=0 && tipo<MAX_TIPO && totSer[tipo]<MAX_CANT) { //Hay espacio
			int i=0;
			while(serpientes[tipo][i]!=null)
				i++;
			serpientes[tipo][i]=new Serpiente(nombre, clave, alimentacion, tipo);
			totSer[tipo]++;
			resp=true;
		}
		return resp;
	}
	private int[] buscaPosicion(Serpiente s){
		int[]res=new int[2];
		int i=0,cont=0;
		boolean band=false;
		while(i<MAX_TIPO && !band) {
			if(totSer[i]>0) {
				int j=0;
				while(cont<totSer[i] && !band) {
					if(serpientes[i][j]!=null) {
						if(serpientes[i][j].equals(s)) {
							band=true;
							res[0]=i;
							res[1]=j;
						}
						cont++;
					}
					else
						j++;
				}
			}
			i++;	
		}
		if(!band)
			res=null;
		return res;
	}
	public String consultaPorClave(int clave) {
		String resultado;
		int[]pos;
		pos=this.buscaPosicion(new Serpiente(clave));
		if(pos==null)//No está la serpiente
			resultado=null;
		else {
			int i=pos[0];
			int j=pos[1];
			resultado=serpientes[pos[0]][pos[1]].toString();
		}
		return resultado;
	}
	public Serpiente bajaSerpiente2(int clave) {
		Serpiente resultado;
		int[]pos;
		pos=this.buscaPosicion(new Serpiente(clave));
		if(pos==null)//No está la serpiente
			resultado=null;
		else {
			resultado=serpientes[pos[0]][pos[1]];
			serpientes[pos[0]][pos[1]]=null;
			totSer[pos[0]]--;
		}
		return resultado;
	}
	public String infoSerpiente(int clave) {
		int i=0,j=0;
		while(i<MAX_TIPO && serpientes[i][j].getClave()!=clave) {
			i++;
			while(j<MAX_CANT && serpientes[i][j].getClave()!=clave) {
				j++;
			}
		}
		if(i==MAX_CANT && j==MAX_TIPO)
			return null;
		else 
			return serpientes[i][j].toString();
	}
	public String infoSerpiente2(int clave) {
		Serpiente x=new Serpiente(clave);
		int pos[]=buscaPosicion(x);
		if(pos==null)
			return "ERROR";
		else
			return serpientes[pos[0]][pos[1]].toString();
	}
	public int contTipoAlim(String alimentacion) {
		int cont=0;
		for(int i=0;i<MAX_TIPO;i++)
			for(int j=0;j<MAX_CANT;j++)
				if(serpientes[i][j]!=null && serpientes[i][j].getAlimentacion().equals(alimentacion))
					cont++;
		return cont;
	}
	public int contTipoAlim2(String alimentacion) {
		int contAlim=0,contAux,i,j;
		for(i=0;i<MAX_TIPO;i++) {
			contAux=0;
			j=0;
			while(contAux<totSer[i]) {
				if(serpientes[i][j]!=null) {
					contAux++;
					if(serpientes[i][j].getAlimentacion().equalsIgnoreCase(alimentacion))
						contAlim++;
				}
				j++;
			}
		}
		return contAlim;
	}
	public boolean bajaSerpiente(String nombre,int clave,String alimentacion,int tipo) {
		boolean resp=false;
		int i=0;
		Serpiente x = new Serpiente(nombre, clave, alimentacion, tipo);
		while(serpientes[tipo][i]!=x && i<MAX_CANT)
			i++;
		if(i!=MAX_CANT) {
			serpientes[tipo][i]=null;
			totSer[tipo]--;
			resp=true;
		}
		return resp;
	}
	public int tipoMax() {
		int i,posMax=-1,maxSer=-1;
		for(i=0;i<totSer.length;i++)
			if(totSer[i]>0 && totSer[i]>maxSer) {
				maxSer=totSer[i];
				posMax=i;
			}
		return posMax;
	}
}
