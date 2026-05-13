package GeneralClasses2;

public class NumRoulette {
	private int num;
	private String color;
	
	public NumRoulette(int num, String color) {
		this.num=num;
		this.color=color;
	}

	public int getNum() {
		return num;
	}

	public String getColor() {
		return color;
	}
	public String toStringNumeroNegro() {
		return "num=" + num + ", color=" + color;
	}
	public boolean equals(NumRoulette otro) {
		boolean res=false;
		if(this.color.equalsIgnoreCase(otro.color) && this.num==otro.num)
			res=true;
		return res;
	}
	public int compareTo(NumRoulette otro) {
		return this.num-otro.num;
	}

}
