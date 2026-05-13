package GeneralClasses3;

public class DebuggerContador {
	private int suma;
	public DebuggerContador() {
		suma=0;
	}
	public void sumaN(int n) {
		int aux=0;
		for(int i=0;i<n;i++)
			aux=aux+i;
		suma=aux;
	}
	public int getResultado() {
		return suma;
	}
	public String toString() {
		return "Utiliza el Detail Formatter ";
	}

	public static void main(String[] args) {
		DebuggerContador pruebaContador=new DebuggerContador();
		int n=10;
		pruebaContador.sumaN(n);
		System.out.println("La suma de 1 a " + n + " es igual a " + pruebaContador.getResultado());

	}

}
