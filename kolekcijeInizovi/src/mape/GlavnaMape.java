package mape;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GlavnaMape {

	public static void main(String[] args) {
		/*
		 * //key - value 
		 * Map <Integer, String> mapaImena = new HashMap<Integer,String>(); 
		 * mapaImena.put(11, "Nenad"); 
		 * mapaImena.put(21, "Ivan");
		 * mapaImena.put(42, "Ogi"); 
		 * mapaImena.put(101, "Milica");
		 * 
		 * System.out.println("Ime: " + mapaImena.get(101));
		 * 
		 * for(Map.Entry<Integer, String> me: mapaImena.entrySet()) {
		 * System.out.println("Kljuc: " + me.getKey() ); 
		 * System.out.println("Vrednost: "+ me.getValue() ); }
		 */
		
		User u1 = new User();
			 u1.setIme("Pera");
			 u1.setPrezime("Peric");
			 u1.setJmbg("1234");
			
		User u2 = new User();
			 u2.setIme("Mika");
			 u2.setPrezime("Mikic");
			 u2.setJmbg("9876");
		
		User u3 = new User();
			 u3.setIme("Ruza");
			 u3.setPrezime("Ruzic");
			 u3.setJmbg("8170");
			 
		Map<String, User> mapaUsera = new HashMap<>();
			mapaUsera.put(u1.getJmbg(), u1);
			mapaUsera.put(u2.getJmbg(), u2);
			mapaUsera.put(u3.getJmbg(), u3);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite jmbg: ");
		String jmbgUneto = scanner.nextLine();
		scanner.close();
		
		if(mapaUsera.containsKey(jmbgUneto)) {
			User nadjeniUser = mapaUsera.get(jmbgUneto);
			System.out.println("Nadjeni user: ");
			System.out.println("Ime usera: " + nadjeniUser.getIme());
			System.out.println("Prezime usera: " + nadjeniUser.getPrezime());
		}else{
			System.out.println("Ne postoji taj jmbg u nasoj mapi...");
		}

		// napravi klasu Proizvod
		// -sifra proizvoda
		// - naziv proizvoda
		// - cena proizvoda
		// u glavnoj napraviti 3 proizvoda, stavitiih u mapu (korpa)
		// izracunati cenu iz korpe
		

	}

}
