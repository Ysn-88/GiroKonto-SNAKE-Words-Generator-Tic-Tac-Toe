package Giro;

public class Start {

	public static void main(String[] args) {
		
		Konto yassine = new Konto(0, "Yassine");
		Konto ayoub = new Konto(1500, "mohanmed");
		
		
		yassine.zeigen();
		ayoub.zeigen();
		
		ayoub.überWeisung(500, yassine);
		System.out.println("|                                |");
		System.out.println(" ________________________________"); 
		System.out.println("|                                |");
		
		yassine.zeigen();
		ayoub.zeigen();
		yassine.einZahlung(300);
		yassine.ausZahlng(80);
		System.out.println("|                                |");
		System.out.println(" ________________________________"); 
		System.out.println("|                                |");
		
		yassine.setName("ahmed");
		yassine.setSold(40);
		yassine.zeigen();
		
		
		
	}

}
