package liste;

import java.util.ArrayList;
import java.util.List;

public class GlavnaListe {

	public static void main(String[] args) {
		
		//instancirali smo listu (genericka)
		List<String> sveIsvasta = new ArrayList<String>();
		
		sveIsvasta.add("32");
		sveIsvasta.add("Pera");
		sveIsvasta.add("Sta hocu....");
		sveIsvasta.add("...");
		sveIsvasta.add("32");
	
		String izListe = sveIsvasta.get(2);
		//System.out.println(izListe);
		
		for(int i = 0; i < sveIsvasta.size(); i++ ) {
			
			System.out.println(sveIsvasta.get(i));
		}
		
		//izbacio sam iz liste String sa index-om tri
		sveIsvasta.remove(3);
		
		System.out.println("Nakon izbacivanja: ");
		for(int i = 0; i < sveIsvasta.size(); i++ ) {
			
			System.out.println(sveIsvasta.get(i));
		}
		
		String treci = sveIsvasta.get(3);
		System.out.println("Treci je sad " + treci);
		
		//ocisti celu list
		sveIsvasta.clear();
		System.out.println("Nakon ciscenja: ");
		for(int i = 0; i < sveIsvasta.size(); i++ ) {
			
			System.out.println(sveIsvasta.get(i));
		}
		
		sveIsvasta.add("Nenad");
		sveIsvasta.add("Ogi");
		
		System.out.println("Nakon ponovnog dodavanja: ");
		//enhanched for - for each
		for(String s: sveIsvasta) {
			System.out.println(s);
		}
		
		
		

	}

}
