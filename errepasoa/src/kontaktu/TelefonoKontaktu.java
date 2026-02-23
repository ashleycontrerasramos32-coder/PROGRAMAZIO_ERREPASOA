package kontaktu;

public class TelefonoKontaktu extends Kontaktua implements Balidagarria {
	
	private String telefonoa;
	
	private char mota; 
	
	public TelefonoKontaktu(String telefonoa) {
		this.telefonoa=telefonoa;
		balidatu();
	}

	@Override
	public boolean balidatu() {
		
		if(telefonoa==null) {
			setBaliozkoa(false);
			mota=' ';
			return false;
		}
		
		for(int i=0; i<telefonoa.length(); i++ ) {
			if(telefonoa.charAt(i)<'0' || telefonoa.charAt(i)>'9' ) {
				setBaliozkoa(false);
				mota=' ';
				return false;
			}
		}
		
		
			if(telefonoa.charAt(0)=='9') {
				mota='F';
				
			} else {
				mota='M';
			}
			setBaliozkoa(true);
		
			return true;

		
		
		// TODO Auto-generated method stub
		
		
	}
	

	public String getTelefonoa() {
		return telefonoa;
	}

	public void setTelefonoa(String telefonoa) {
		this.telefonoa = telefonoa;
	}

	public char getMota() {
		return mota;
	}

	public void setMota(char mota) {
		this.mota = mota;
	}

	@Override
	public String toString() {
		return "TelefonoKontaktu [telefonoa=" + telefonoa + ", mota=" + mota + "]";
	}
	
	
	
	
	
	

}
