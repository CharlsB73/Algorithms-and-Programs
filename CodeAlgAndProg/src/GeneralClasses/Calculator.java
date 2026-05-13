package GeneralClasses;

/*Clase con métodos estáticos
 * CC
 */
public class Calculator {
	public static int calculaFactorial(int n) {
		int factorial=1,i;
	
		for(i=n; i>0; i--) {
			factorial = factorial*i;
		}
	return factorial;
	
	}
	
	public static double calculaSerie3(int n) {
		double sumafac = 0.0;
		int i;
			
		for(i=0; i<=n; i++) {
			sumafac = sumafac + calculaFactorial(n-i)/calculaFactorial(i);
		}
		
		return sumafac;
	}
	
	public static int MCD(int m, int n) {
		int temporal;
		
		while (n != 0) {
			temporal = m;
			m = n;
			n = temporal % m;
		}
		return m;
	}
	public static String calculaUllman(int n) {
		StringBuilder sB = new StringBuilder();
		
		while (n != 1) {
			if (n % 2 == 0) //Es par
				n = n / 2;
			else 
				n = n * 3 + 1;
			sB.append(n).append(" ");
			
		}
		return sB.toString();
	}
	
	public static String generaCubosNicomano(int n) {
		StringBuilder cadena = new StringBuilder();
		int i = 0;
		double x = 0;
		
		for (i=n; i>0; i--) {
			x = Math.pow(i, 3);
			cadena.append(x).append(" ");
		}
		
		return cadena.toString();
	}
	
	public static String generaSerieFibonacci(int n) {
		StringBuilder cadena = new StringBuilder();
		int i = 0;
		int a = 0, b = 1, c = 0;
		
		for (i=1; i<=n; i++) {
			c = a + b;
			cadena.append(c).append(" ");
			a = b;
			b = c;
		}
		return "0 " + "1 " + cadena.toString();
	}
	
	public static double calculaSerie2(int n, int num) {
		int i;
		double sumaX = 0, denom = 3.0;
		
		for (i=1; i<=n; i++) {
			sumaX = sumaX + (num/denom);
			denom = denom + 2.0;
			if (denom>7)
				denom = 3.0;
		}
		return sumaX;
		
		
		
	}
	
	public static String generaCubosNicomaco2(int n) {
		StringBuilder lele = new StringBuilder();
		int antique = -1;
		for (int i = 1; i <= n; i++) {
			int num = 0;
			int sum = 0;
				for (int z=1; z<=i; z++) {
					num = antique + 2;
					sum = num + sum;
					lele.append(num).append(" ");
					antique = num;
				}
				//System.out.print("O");
				lele.append(" = " + sum + " = " + sum/(i*i) + "^3");
				lele.append("\n");
		}
		return lele.toString();
	}
	
	public static boolean esDivisiblePor11(int n) {
		boolean flag = true;
		int dig, SP = 0, SI = 0;
		
		while (n>0) {
			dig = n%10;
			n = n/10;
			if(flag) {
				SP = SP + dig;
			}
			else
				SI = SI + dig;
			flag = !flag;
		}
		if ((SP-SI)%11 == 0) {
			flag = true;
		}
		else {
			flag = false;
		}
		return flag;
	}


}
