package set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Glavnaset {

	public static void main(String[] args) {
		
		//lista vs set
		
		List<String> listaImena = new ArrayList<String>();
			listaImena.add("Nenad");
			listaImena.add("Ivan");
			listaImena.add("Milica");
			listaImena.add("Ogi");
			listaImena.add("Nenad");
			
		System.out.println("Imena iz liste su: ");
		
		for(String s: listaImena) {
			System.out.println(s);
		}
		
		System.out.println("Imena iz liste preko iteratora su: ");
		Iterator<String> iter = listaImena.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		Collection<String> setImena = new HashSet<>();
			setImena.add("Nenad");
			setImena.add("Ivan");
			setImena.add("Milica");
			setImena.add("Ogi");
			setImena.add("Nenad");
			setImena.add("Milica");
		
		System.out.println("Imena iz seta su: ");
		for(String s: setImena) {
			System.out.println(s);
		}
		
		System.out.println("Imena iz seta preko iteratora su: ");
		Iterator<String> iterSet = setImena.iterator();
		while(iterSet.hasNext()) {
			String s = iterSet.next();
			System.out.println(s);
		}
		

	}

}
