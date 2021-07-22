package nizovi;

public class GlavnaNizovi {
	
	public static boolean zamisljeniBroj(int brojKojiSamZamislio, int[]loto) {
		boolean zamisljeni = false;
		
		for(int i= 0; i < loto.length; i++) {
			if(loto[i] == brojKojiSamZamislio) {
				zamisljeni = true;
				break;
			}
		}	
		return zamisljeni;
	}
	
	
	public static double prosekOcena(int [] ocene) {
		double prosek = 0;
		int zbir = 0;
			for(int i = 0; i < ocene.length; i++) {
				zbir += ocene[i];
			}
		prosek = (double)zbir/ocene.length;
		
		return prosek;	
	}
	
	
	public static void prikaziUcenike(Ucenik [] ucenici) {
		for(int i = 0; i < ucenici.length; i++) {
			System.out.println("Ucenik " + ucenici[i].getIme());
			System.out.println("Prosek: " + ucenici[i].getProsek());
		}	
	}
	
	

	public static void main(String[] args) {
		
		// loto kombinacije
		int [] lotoKombincije = new int[9];
		lotoKombincije[0] = 2;
		lotoKombincije[1] = 34;
		lotoKombincije[2] = 17;
		lotoKombincije[3] = 12;
		lotoKombincije[4] = 21;
		lotoKombincije[5] = 7;
		lotoKombincije[6] = 29;
		
		System.out.println("Izvuceni loto brojevi su: ");
		for(int i = 0; i < lotoKombincije.length; i++ ) {
			System.out.println(lotoKombincije[i]);
		}
		
		boolean zamisljeni = zamisljeniBroj(12,lotoKombincije);
		System.out.println("Da li sam zamislio jedan od loto brojeva: " + zamisljeni);
		
		int ocene [] = {3,4,5,2,4};
		
		System.out.println(ocene[4]);
		
		double prosek = prosekOcena(ocene);
		System.out.println("Prosek ocena je " + prosek);
		
		
		String [] mojaOmiljenaImena = new String [4];
			mojaOmiljenaImena[0] = "Ogi";
			mojaOmiljenaImena[1] = "Milica";
			mojaOmiljenaImena[3] = "Maja";
			
		System.out.println("Omiljena imena: ");
		
		for(int i = 0; i < mojaOmiljenaImena.length; i++) {
			System.out.println(mojaOmiljenaImena[i]);
		}
		
		Ucenik ucenik1 = new Ucenik("Pera", 4.5);
		Ucenik ucenik2 = new Ucenik("Mile", 3.8);
		Ucenik ucenik3 = new Ucenik("Ruza", 5.0);
		
		Ucenik [] sviUcenici = {ucenik1, ucenik2, ucenik3};
		
		prikaziUcenike(sviUcenici);
		
		
		

	}

}
