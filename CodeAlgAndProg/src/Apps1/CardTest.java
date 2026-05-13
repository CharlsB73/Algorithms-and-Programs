package Apps1;

import GeneralClasses.Card;

public class CardTest {

	public static void main(String[] args) {
		
		Card x1 = new Card(2323, "titular", 1, 2, 2020);
		Card x2 = new Card(1029, "adicional", 2, 0, 2019);
		
		System.out.println(x1.calcComision());
		System.out.println(x2.calcCredDisp());
	}

}