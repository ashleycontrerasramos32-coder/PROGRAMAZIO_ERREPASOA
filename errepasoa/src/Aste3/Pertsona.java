package Aste3;

public abstract class Pertsona {
	
	private String izena;
	
	private String abizena;
	
	private String nan;

	public Pertsona(String izena, String abizena, String nan) {
		this.izena = izena;
		this.abizena = abizena;
		this.nan = nan;
				
		for(int i=0; i<izena.length(); i++) {
			
			izena=izena.substring(0, 1).toUpperCase()+izena.substring(1, izena.length()).toLowerCase();
			
		}
	
		
		for(int i=0; i<abizena.length();i++) {
			
			abizena=abizena.substring(0, 1).toUpperCase()+abizena.substring(1, izena.length()).toLowerCase();

		}		
	}
	
	public Pertsona(String izena, String abizena) {
		this.izena=" ";
		this.abizena=" ";
		
		for(int i=0; i<izena.length(); i++) {
			
			izena=izena.substring(0, 1).toUpperCase()+izena.substring(1, izena.length()).toLowerCase();
			
		}
	
		
		for(int i=0; i<abizena.length();i++) {
			
			abizena=abizena.substring(0, 1).toUpperCase()+abizena.substring(1, izena.length()).toLowerCase();

		}	
		
	}
	
	public Pertsona() {
		super();
	}
	
	abstract double ordainketaKalkulatu(double oinarrizkoPrezioa) // CLASE ABSTRACTA
	;

	@Override
	public String toString() { //METODO TOSTRING
		return "Pertsona [izena=" + izena + ", abizena=" + abizena + ", nan=" + nan + "]";
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}
	
	
	
	

		

	
	
	
	

}
