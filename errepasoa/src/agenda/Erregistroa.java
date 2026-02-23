package agenda;

import kontaktu.Balidagarria;

public class Erregistroa implements Balidagarria {

	private String NAN;
	
	private String siglak;
	
	private String izena;
	
	private String jaioteguna;
	
	private int Kontaktua=3;
	
	private final int MIN=15;
	
	private final int MAX=25;
	
	public Erregistroa(String NAN, String izena, String jaioteguna) {
		this.NAN=NAN;
		this.izena=izena;
		this.jaioteguna=jaioteguna;
		balidatu();
		sortuSiglak();
	}
	
	public int getErregistroKopurua() {
		
	
	}
	@Override
	public boolean balidatu() {
		
		balidatuNAN();
		
		balidatuJaioteguna();
		
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean balidatuNan() {
		for(int i=0; i<NAN.length(); i++) {
			if(NAN.substring(NAN.lastIndexOf('-')-1).length())) {
				
			}
			else {
				System.out.println("XXXXXXXX-X");
			}
		}
	}
	
	
	

}
