package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jlab11/tests/";
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		try {
			var writer = new PrintWriter(MAPPE + filnavn);
			
			writer.println(samling.toString());
			writer.close();
			return true;
		}
		catch(FileNotFoundException E) {
			System.out.println("finner ikkje fil");
			
		}
		return false;
 
		
	}
}
