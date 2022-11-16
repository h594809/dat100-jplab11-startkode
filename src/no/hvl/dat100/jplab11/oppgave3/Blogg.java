package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggstabell;
	
	private int nesteledig;

	
	public Blogg() {
		this(20);
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0; i < nesteledig; i++) {
			if(innleggstabell[i].erLik(innlegg)) {
				return i;
			}	
		}
		return -1;		
 
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return nesteledig <= innleggstabell.length;
		
	}
	
	public boolean leggTil(Innlegg innlegg) {
     
		if(!ledigPlass() || finnes(innlegg)) {
			return false;
		}
		innleggstabell[nesteledig] = innlegg;
		nesteledig++;
		return true;
	}
	
	public String toString() {
		var strr = new StringBuilder(Integer.toString(nesteledig));
		for(Innlegg innlegg : innleggstabell) {
			if(innlegg == null) {
				break;
			}
			strr.append(innlegg.toString());
		}
		return strr.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}