package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti=new ArrayList<>();
	}
	
	
	public Libretto(List<Voto> voti) {
	     //	this.voti=voti;
	     //non è cambiato perchè prima ho copiato il reference, ovvero entrambi i libretti puntano allo stesso indirizzo di memoria
		
		//	this.voti=new ArrayList<Voto>(voti);
		// sbagliata ancora, copio gli stessi voti
		
		
		//faccio lo stesso di sopra
//		this.voti=new ArrayList<Voto>();
//		for(Voto v: voti) {
//			this.voti.add(v);
//		}
		
		
		//oggetti identici che contengono gli stessi valori
		this.voti=new ArrayList<Voto>();
		for(Voto v:voti) {
			this.voti.add(new Voto(v.getNome(), v.getVoto()));
		}
	}
	
	
	
	public void add(Voto v) {
		if(this.voti.contains(v)) {
			System.out.println("Il voto esiste già");
			return;
		}
		
		for(Voto voto: this.voti) {
			if(voto.getNome().equals(v.getNome())) {
				System.out.println("Trovato lo stesso esame (aggiornato il voto)");
				voto.setVoto(v.getVoto());
			}
		}
		this.voti.add(v);
	}

	public void stampa() {
		// TODO Auto-generated method stub
		System.out.println("Ci sono "+voti.size()+" voti ");
		for(Voto v: this.voti) {
			System.out.println(v);
		}
	}

	public void stampa25() {
		// TODO Auto-generated method stub
		for(Voto v :this.voti) {
			if(v.getVoto()==25) {
				System.out.println(v);
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("\nCi sono "+voti.size()+" voti\n");
		
		for(Voto v: this.voti) {
			sb.append(v.toString());
			sb.append("\n");
		}
		
		return sb.toString();
	}

	public String getMarkfromClass(String nomeCorso) {
		// TODO Auto-generated method stub
		for(Voto v:this.voti) {
			if(v.getNome().toLowerCase().equals(nomeCorso.toLowerCase())) {
				return String.valueOf(v.getVoto());
			}
		}
		return "nomeCorso not found";
	}
	
	
	public List<Voto> getVoti(){
		return this.voti;
	}


	public void alzaVoti() {
		// TODO Auto-generated method stub
		for(Voto v:this.voti) {
			if(v.getVoto()>=24) {
				v.setVoto(v.getVoto()+2);
			}else if(v.getVoto()>=18) {
				v.setVoto(v.getVoto()+1);
			}
		}
	}

	
}
