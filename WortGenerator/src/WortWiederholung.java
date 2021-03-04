

public class WortWiederholung
{
	public static final String konsonanten = "bcdfghjklllllmnnnnnpqrrrrssssstttttvwxyz";
	public static final String vokale = "aaeeeeeeaeeeeeeeiiiioooouuäöü";
	public static final String zeichen = ",.-:";
	public static final String[] satzzeichen= zeichen.split("");
	
	public static void main(String[] args)
	{
		System.out.println(
		generiereAbsatz(10)+
		generiereAbsatz(12)+
		generiereAbsatz(8)+
		generiereAbsatz(15)+
		generiereAbsatz(3));
		
	}

	
	public static int randomInt(int min, int max) 
	{
		
		return (int)( min + (Math.random() * (max-min)));
	}
	
	public static int randomInt(int max) 
	{
		
		return randomInt(0, max);
	}
	
	
	private static String generiereAbsatz(int länge) 
	{
		String ergebnis = "";
		for (int i = 0; i < länge; i++)
		{
			ergebnis += generiereSatz(randomInt(4, 11))+"\n";
		}
		return ergebnis+"\n";
	}
	
	private static String generiereSatz(int länge) 
	{
		if( länge < 3 || länge > 15) 
		{
			länge = 7;
		}
		String ergebnis= "";
		String trenner = "";
		for (int i = 0; i < länge; i++)
		{
			boolean gross = trenner.equals(". ");
			ergebnis += trenner+ generiereWort(randomInt(4,10), gross);
			if(Math.random()> 0.5 && i % 3 == 0) trenner = satzzeichen[randomInt(satzzeichen.length)]+" ";
			else trenner  = " ";
		}
		return camelCase(ergebnis+". ");
		
	}
	private static String generiereWort(int länge, boolean substantiv)
	{
		String ergebnis = "";
		int vokalOderKonsonant = randomInt(2);
		for (int i = 0; i <länge; i++)
		{
			if(i % 2== vokalOderKonsonant ) 
			{
				ergebnis += konsonanten.charAt(randomInt(konsonanten.length()));
			}
			else 
			{
				ergebnis = ergebnis + vokale.charAt(randomInt(vokale.length()));
		
			}
		}
		boolean cC = substantiv;
		return cC ? camelCase(ergebnis) : ergebnis;
	}

	private static String camelCase(String eingabe)
	{
		return (""+eingabe.charAt(0)).toUpperCase()+eingabe.substring(1);
		
	}

}















//package oCA201;
//
//import java.util.Arrays;
//
//public class WortWiederholung
//{
//	public static final String konsonanten = "bcdfghjklmnpqrstvwxyz";
//	public static final String vokale = "aeiouäöü";
//
////	public static final String[] buchstArray = buchstaben.split("");
//
//	public static void main(String[] args)
//	{
////		System.out.println("Alternative 1 " +Arrays.deepToString( buchstArray));
//
//		System.out.println(wort(7) + " " + wort( 4) + " " +wort( 4)+ " "+ wort( 4)+ " "+ wort( 4)+ " "+ wort( 4)) ;
//
//	}
//
//	private static String wort(int länge)
//	{
//		String rückgabe = "";
//		
//		rückgabe  = rückgabe.concat((""+konsonanten.charAt((int) (Math.random()*konsonanten.length()))).toUpperCase());
//		for (int i = 1; i <länge; i++)
//		{
//			if(i % 2 == 0) 
//			{
//				rückgabe  = rückgabe.concat(""+konsonanten.charAt((int) (Math.random()*konsonanten.length())));
//			}
//			else 
//			{
//				rückgabe  = rückgabe.concat(""+vokale.charAt((int) (Math.random()*vokale.length())));
//		
//			}
//		}	
//		return rückgabe;
//	}
//
//}

