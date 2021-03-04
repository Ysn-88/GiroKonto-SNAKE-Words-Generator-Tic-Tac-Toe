package Giro;

public class Konto {
	double sold = 0.0;
	String name;
	
	public Konto(double sold, String name) {
		super();
		this.sold = sold;
		this.name = name;
	}


	public double getSold_name() {
		return sold;
	}


	public void setSold(double sold) {
		this.sold = sold;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	void einZahlung (double menge)
	{
		sold = sold + menge;
	}
		

	void ausZahlng (double menge)
	{
		sold  = sold - menge ;
		
	}
	void überWeisung (double menge, Konto destination)
	{
		this.ausZahlng(menge);
		destination.einZahlung(menge);
	}
	void zeigen()
	{
		System.out.println("  SOLDE Von "+name + " ist :"+sold+ " €");
	}
}

