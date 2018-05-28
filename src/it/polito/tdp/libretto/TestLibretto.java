package it.polito.tdp.libretto;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libretto lib= new Libretto();
		
		lib.add(new Voto("Analisi", 30));
		lib.add(new Voto("Chimica", 28));
		lib.add(new Voto("Tdp", 25));
		
		lib.stampa();
		//System.out.println(lib.toString());
		
		System.out.println("\nVoti uguali a 25");
		lib.stampa25();
		
		System.out.println("\nVoti con materia Tdp");
		System.out.println(lib.getMarkfromClass("Tdp"));
		
		System.out.println("\nVoti con materia tdp");
		System.out.println(lib.getMarkfromClass("tdp"));
		
		System.out.println("\nInserisco nuovi voti");
		lib.add(new Voto("Tdp", 25));
		lib.add(new Voto("Tdp", 27));
		
		System.out.println(lib.toString());
		
		
		System.out.println("\nNUOVO LIBRETTO");
		Libretto newLib=new Libretto(lib.getVoti());
		System.out.println(newLib.toString());
		
		newLib.alzaVoti();
		
		System.out.println("\nNUOVO LIBRETTO");
		System.out.println(newLib.toString());
		
		System.out.println("\nVECCHIO LIBRETTO");
		System.out.println(lib.toString());
		
		Collections.sort(newLib.getVoti());
		
		System.out.println("\nNUOVO LIBRETTO ORDINATO ALFABETICAMENTE");
		System.out.println(newLib.toString());
		
		
		Collections.sort(newLib.getVoti(), new Comparator<Voto>() {
			public int compare(Voto v1, Voto v2) {
				return -(v1.getVoto() - v2.getVoto());
			}
		});
		
		System.out.println("\nNUOVO LIBRETTO ORDINATO PER VOTI");
		System.out.println(newLib.toString());
	}

}
