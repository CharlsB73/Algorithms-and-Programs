package GeneralClasses3;

public class Restaurante {
	private String nombre;
	private String direccion;
	private int telefono;
	private final int MAX_MESAS=3;
	private Dish [][] alimentos;
	private final int MAX_ALIM=4;
	private int contAlimXMesa[];
	private Dish [] menuPlatillos;
	private final int MAX_MENU=5;
	private int totMenuPlatillos;
	
	public Restaurante() {
		
	}
	public Restaurante(String nombre,String direccion,int telefono) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		alimentos=new Dish[MAX_MESAS][MAX_ALIM];
		contAlimXMesa=new int[MAX_ALIM];
		menuPlatillos=new Dish[MAX_MENU];//poner MAX
		totMenuPlatillos=0;
		for(int i=0;i<MAX_MESAS;i++) {
			contAlimXMesa[i]=0;
			menuPlatillos[i]=null;
			for(int j=0;j<MAX_ALIM;j++)
				alimentos[i][j]=null;
		}
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public int getTotMenuPlatillos() {
		return totMenuPlatillos;
	}
	public String toStringRestaurante() {
		StringBuilder sB=new StringBuilder();
		for(int i=0;i<MAX_MESAS;i++)
			for(int j=0;j<contAlimXMesa[i];j++)
				sB.append(alimentos[i][j].toString()).append("\n");
		return sB.toString();
	}
	
	//Inciso h
	public boolean altaMenu(String nombre,String descripcion,double precio) {
		Dish platillo=new Dish(nombre, descripcion, precio);
		boolean res=false;
		int i=0;
		boolean band=true;
		while(i < MAX_MENU && (menuPlatillos[i] != null && !menuPlatillos[i].equals(platillo)) && band) {
			if(menuPlatillos[i]==null) {
				menuPlatillos[i]=platillo;
				band=false;
				res=true;
			}
			else if(menuPlatillos[i].equals(platillo)) {
				res=false;
				band=false;
				}
			i++;
		}
		return res;
	}
	//Inciso i
	public boolean bajaMenu(String nombre,String descripcion,double precio) {
		Dish platillo=new Dish(nombre, descripcion, precio);
		boolean res=false;
		int i=0;
		boolean band=true;
		while(i<MAX_MENU && band) {
			if(menuPlatillos[i].equals(platillo)) {
				menuPlatillos[i]=null;
				band=false;
				res=true;
			}
			i++;
		}
		return res;
	}
	public boolean altaPlatillo(String nombre,String descripcion,double precio,int mesa) {
		boolean res=false;
		if(alimentos[mesa].length<MAX_ALIM) {
			res=true;
			alimentos[mesa][contAlimXMesa[mesa]]=new Dish(nombre, descripcion, precio);
			contAlimXMesa[mesa]++;
		}
		return res;
	}
	//Inciso k
	public boolean bajaMesa(int mesa) {
		boolean res=false;
		if(mesa>=0) {
			res=true;
			int i=0;
			while(i<contAlimXMesa[mesa]) {
				alimentos[mesa][i]=null;
				i++;
			}
		}
		return res;
	}
	//Inciso a
	public double totPagarXMesa(int mesa) {
		double cuenta=0;
		int i=0;
		boolean band=true;
		while(i<contAlimXMesa[mesa] && band) {
			cuenta+=alimentos[mesa][i].getPrecio();
			i++;
		}
		return cuenta;
	}
	//Inciso b
	public boolean siAlimEnMesas(int clave) {
		boolean res=false,band=true;
		int i=0;
		while(i<MAX_MESAS && band) {
			int j=0;
			while(j<MAX_ALIM && band) {
				if(alimentos[i][j] != null && alimentos[i][j].equals(new Dish(clave))) {
					band=false;
					res=true;
				}
			}
			j++;
		}
		return res;
	}
	//Inciso c
	public int mesaMenosAlim() {
		int minAlim=100000,mesa=-1;
		for(int i=0;i<contAlimXMesa.length;i++) {
			if(contAlimXMesa[i]<minAlim) {
				minAlim=contAlimXMesa[i];
				mesa=i;
			}
		}
		return mesa;
	}
	//Inciso d
	public int mesaMinGasto() {
		int mesa=0;
		double minGasto=10000000000.0;
		for(int i=0;i<MAX_MESAS;i++) {
			if(totPagarXMesa(i)<minGasto) {
				mesa=i;
				minGasto=totPagarXMesa(i);
			}
		}
		return mesa;	
	}
	//Inciso e
	public Dish alimTodMesas() {
		int k=0,cont=0;
		boolean bandMenu=true;
		Dish platillo=null;
		while(k<totMenuPlatillos && bandMenu) {
			int i=0;
			boolean bandPlatillo=true;
			while(i<MAX_MESAS && bandPlatillo) {
				int j=0;
				while(j<contAlimXMesa[i] && cont==0) {
					if(alimentos[i][j].equals(menuPlatillos[k])) {
							cont++;
					}
					j++;
				}
				if(j==contAlimXMesa[i])
					bandPlatillo=false;
				i++;
			}
			if(i==MAX_MESAS) {
				bandMenu=false;
				platillo=menuPlatillos[k];
			}
			k++;
		}	
		return platillo;
	}
	//Inciso f
	public int contAlimEsp(Dish x) {
		int contMesas=0;
		for(int i=0;i<MAX_MESAS;i++) {
			int j=0;
			boolean band=true;
			while(j<contAlimXMesa[i] && band) {
				if(alimentos[i][j].equals(x)) {
					band=false;
					contMesas++;
				}
				j++;
			}
		}
		return contMesas;
	}
	//Inciso g
	public String alimMasCaro() {
		StringBuilder sB=new StringBuilder();
		double maxPrecio=-1;
		int posAlimMax=-1;
		for(int i=0;i<totMenuPlatillos;i++) {
			if(menuPlatillos[i].getPrecio()>maxPrecio) {
				maxPrecio=menuPlatillos[i].getPrecio();
				posAlimMax=i;
			}
		}
		sB.append(menuPlatillos[posAlimMax].toString());
		return sB.toString();
	}
	

}
