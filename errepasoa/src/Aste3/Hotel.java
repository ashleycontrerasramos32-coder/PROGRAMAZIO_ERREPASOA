package Aste3;

public class Hotel {
	
	private Gela [][] gelenMatrizea;
	
	private String erreserbak [];
	
	private int kontErreserbak;
	
	
	public Hotel(int solairuKop, int gelaKop) {
		
		
		this.gelenMatrizea=new Gela[solairuKop][gelaKop];
		
		erreserbak=new String[2000];
		
		kontErreserbak=0;
		
		for (int i = 0; i < solairuKop ; i++) {
			for (int j = 0; j < gelaKop; j++) {
				gelenMatrizea[i][j]=new Gela(i*100+(j+1), (int)(Math.random()*51+100));
			}
			
		}


	}
	
	public void ikusi() {
		for (int i = 0; i < gelenMatrizea.length ; i++) {
			for (int j = 0; j < gelenMatrizea[i].length; j++) {
				System.out.print(gelenMatrizea[i][j].getGelaZenbakia()+"\t");
			}
			System.out.println();
		}
	}
	
	public void erreserbakIkusi() {
		for (int i = 0; i < kontErreserbak; i++) {
			System.out.println(erreserbak[i]);
		}
	}
	
	public boolean erreserbatu(int solairua, int zenbakia,Pertsona p) {
		Gela g=gelenMatrizea[solairua-1][zenbakia-1];
		if(g.isOkupatua()) {
			System.out.println(g.toString()+" okupatua dago");
			return false;
		}
		if(g.bezeroaEsleitu(p)) {
			int zenbakiaErreserba=(int)(Math.random()*10001);
			String res="RES"+zenbakiaErreserba;
			while(erreserbaBadago(res)) {
			 zenbakiaErreserba=(int)(Math.random()*10001);
			 res="RES"+zenbakiaErreserba;
			}
			erreserbak[kontErreserbak]=res;
			kontErreserbak++;
			System.out.println(g.toString()+" erreserbatuta dago");
			return true;
		}
		return false;
		
		
	}
	public boolean erreserbaBadago(String str) {
		for (int i = 0; i < kontErreserbak; i++) {
			if(erreserbak[i].equals(str)) {
				return true;
			}
			
		}
		return false;
	}

	public Gela[][] getGelenMatrizea() {
		return gelenMatrizea;
	}
	
}
