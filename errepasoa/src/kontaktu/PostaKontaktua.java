package kontaktu;

public class PostaKontaktua extends Kontaktua implements Balidagarria {
	
	private String postaElektronikoa;
	
	public PostaKontaktua(String postaElektronikoa) {
		this.postaElektronikoa=postaElektronikoa;
		balidatu();
	}

	@Override
	public boolean balidatu() {
		
		if(postaElektronikoa==null && postaElektronikoa.isEmpty()) {
			setBaliozkoa(false);
			return false;
		}
		
		if(postaElektronikoa.charAt(0)=='@' || postaElektronikoa.charAt(postaElektronikoa.length()-1)=='@') {
			setBaliozkoa(false);
			return false;
		}
		
		int kont=0;
		for(int i=1; i<postaElektronikoa.length()-1; i++) {
			if(postaElektronikoa.charAt(i)=='@')
			kont++;
		}
		if(kont!=1) {
			setBaliozkoa(false);
			return false;
		}
		
		if(postaElektronikoa.charAt(postaElektronikoa.indexOf('@')+1)=='.' || postaElektronikoa.charAt(postaElektronikoa.length()-1)=='.' ) {
			setBaliozkoa(false);
			return false;
		}
		
		int kontPunto=0;
		for(int i=postaElektronikoa.indexOf('@')+2; i<postaElektronikoa.length()-1; i++) {
			if(postaElektronikoa.charAt(i)=='.')
			kontPunto++;
		}
		if(kontPunto!=1) {
			setBaliozkoa(false);
			return false;
		}
		
		if(postaElektronikoa.substring(postaElektronikoa.lastIndexOf('.')+1).length()<2) {
			setBaliozkoa(false);
			return false;
		}
		
		for (int i=0; i<postaElektronikoa.length(); i++) {
			if(postaElektronikoa.charAt(i)<'0' || postaElektronikoa.charAt(i)>'9' || 
					postaElektronikoa.charAt(i)!=' ') { // NI NUMEROS NI ESPACIOS
				setBaliozkoa(false);
				return false;
			}
			
			if(postaElektronikoa.charAt(i)<'A' || postaElektronikoa.charAt(i)>'Z' || 
					postaElektronikoa.charAt(i)!=' ') { //NI LETRAS NI ESPACIOS
				setBaliozkoa(false);
				return false;
			}
			
			if(postaElektronikoa.charAt(i)!='.' || postaElektronikoa.charAt(i)!='@' || postaElektronikoa.charAt(i)!='-' || 
					postaElektronikoa.charAt(i)!=' '  ) { //NO PUEDE TENER: ., -, @
				setBaliozkoa(false);
				return false;
			}
		}
		
		
		// TODO Auto-generated method stub
		return true;
		
	}
	
	private boolean letraDigituaDa(char karakterea) {
		
		for(int i=0; i<postaElektronikoa.length();i++) {
			if() {
				return true;
			}
			
		}
		
		return false;
		
		
		
	}
	
	
	
	
	

}
