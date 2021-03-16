package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<>();
	}
	
	public void add (Voto v) {
		this.voti.add(v);
	}
	
	/* Metodi terribili
	 * public void stampaVotiUguali (int punteggio) {
		//Si stampa da solo i voti, metodo pigro
		System.out.println();
	}
	
	public String votiUguali (int punteggio) {
		//calcola una stringa riutilizzabile
		//cosa ci devo mettere? Solo il nome? Nome e voto?
		
	}*/
	
	public List<Voto> listaVotiUguali (int punteggio) {
		//restituisce i voti uguali al criterio
		List<Voto> risultato = new ArrayList<>();
		for (Voto v : this.voti) {
			if (v.getVoto()==punteggio)
			risultato.add(v); //è lo stesso oggetto in ENTRAMBI i libretti, non una sua copia
		}
		return risultato;
	}
	
	public Libretto votiUguali (int punteggio) {
		//restituisce un libretto solo con i voti che vuoi
		//il vantaggio è poter fare tutte le operazioni che faresti sul libretto completo
		
		Libretto risultato = new Libretto();
		for (Voto v : this.voti) {
			if (v.getVoto()==punteggio)
			risultato.add(v);
		}
		return risultato;
	}
	
	
	/**
	 * Ricerca un Voto del corso di cui è specificato il nome
	 * Se non lo trova restituisce null.
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaCorso (String nomeCorso) {
		Voto risultato = null;
		for (Voto v : this.voti) {
			if (v.getNome().equals(nomeCorso)) {
				risultato = v;
				break;
			}
		}
		return risultato;
	}
	
	
	public String toString() {
		String s = "";
		for (Voto v : this.voti) {
			s = s + v.toString() + "\n";
		}
		return s;
	}
	
}
