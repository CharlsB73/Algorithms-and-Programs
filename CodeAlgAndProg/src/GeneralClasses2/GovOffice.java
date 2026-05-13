package GeneralClasses2;

import Arrays.ArrayHandler;

public class GovOffice {
	private String[] nomEst;
	private double[] numHab;
	private int totEst;
	private final int MAX = 80;
	
	
	public GovOffice() {
		nomEst = new String[MAX];
		numHab = new double[MAX];
		totEst = 0;
	}
	
	public GovOffice(int max) {
		nomEst = new String[max];
		numHab = new double[max];
		totEst = 0;
		
	}
	
	public boolean altaDatos(String estado,double pob) {
		boolean resp = false;
		
		if (totEst < nomEst.length) {
			nomEst[totEst] = estado;
			numHab[totEst] = pob;
			totEst++;
			resp=true;
		}
		return resp;
	}
	
	public String estMasPob() {
		int pos;
		String resultado;
		
		pos = (int) ArrayHandler.mayorElem(numHab, totEst);
		if(pos >= 0) {
			resultado = nomEst[pos];
		}
		else {
			resultado = null;
		}
		return resultado;
	}
	
	public double promedioEstados() {
		double promedio = 0;
		
		promedio = ArrayHandler.promElem(numHab, totEst);
		
		return promedio;
	}
	
	public int estPoblMenorProm() {
		int  cont;
		
		cont = ArrayHandler.cuentaMenoresQue(numHab, totEst, promedioEstados());
	
		return cont;
	}

}
