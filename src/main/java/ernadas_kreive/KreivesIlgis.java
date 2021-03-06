package ernadas_kreive;

import java.io.IOException;

import konsole.*;
import plokstuma.*;

public class KreivesIlgis {
	
	private KreiveIsFailo kreive_is_failo;
	private Kreive kreive;
	
	public KreivesIlgis() {
		
		
	}
	
	public KreivesIlgis (KreiveIsFailo kreive_is_failo ) {
		
		this.kreive_is_failo = kreive_is_failo;
	}
	
	public void sakomLabasSpring() {
		
		System.out.println ( " Sakom labas spring ---- ****" );
	}
	
	public void skaiciuojamKreivesIlgi() throws IOException   {
		
		System.out.println( "Labas Java pasauli .." );
		System.out.println( "Skaiciuosim kreives ilgi:" );
																							//   organizuojamas konsolės dialogas, ..
																							// .. kuriuo įvedamas failo vardas, ..
		KonsolesDialogas konsoles_dialogas = new KonsolesDialogas();									// .. arba nustatomas vardas  kreives_taskai.csv, ..
																						// .. pagal nutylejima ir perduodamas priminimo,
			      			//  .. ką įvesti - " kreivės taškų failas "

		kreive_is_failo.setVardasFailo( konsoles_dialogas.ivestiReiksme (" kreives tasku failas", kreive_is_failo.getVardasFailo() ) );
																								// kuriams kreivės skaitymo iš failo objektas ..
		kreive = kreive_is_failo.gautiKreive();											// .. ir pasiimamas Kreives objektas, kuriame yra ..
																											//  .. Taskai masyvas

		// System.out.println ( kreive.toString() );																	// parodomi kreivės taškai
		int i = 0;
		
		while ( i < kreive.getKiek_tasku() ) {
			 
			System.out.println ( kreive.getTaskai()[ i ].getX() + " " +  kreive.getTaskai()[ i ].getY() +  " "  + ( ( (Taskas3D ) kreive.getTaskai()[ i ]).getZ() )  );
			
			i++;
		}
		
		System.out.println ( "Kreives ilgis: " + kreive.ilgis() );												// ir parašomas suskaičiuotas kreivės ilgis		
	}
	
	public void skaiciuojamKreivesIlgiWeb() throws IOException   {
		
		System.out.println( "Labas Java pasauli .." );
		System.out.println( "Skaiciuosim kreives ilgi:" );
																							//   organizuojamas konsolės dialogas, ..
																							// .. kuriuo įvedamas failo vardas, ..
		// KonsolesDialogas konsoles_dialogas = new KonsolesDialogas();									// .. arba nustatomas vardas  kreives_taskai.csv, ..
																						// .. pagal nutylejima ir perduodamas priminimo,
			      			//  .. ką įvesti - " kreivės taškų failas "

		// kreive_is_failo.setVardasFailo( konsoles_dialogas.ivestiReiksme (" kreives tasku failas", kreive_is_failo.getVardasFailo() ) );
																								// kuriams kreivės skaitymo iš failo objektas ..
		kreive = kreive_is_failo.gautiKreive();											// .. ir pasiimamas Kreives objektas, kuriame yra ..
																											//  .. Taskai masyvas

		// System.out.println ( kreive.toString() );																	// parodomi kreivės taškai
		int i = 0;
		
		while ( i < kreive.getKiek_tasku() ) {
			 
			System.out.println ( kreive.getTaskai()[ i ].getX() + " " +  kreive.getTaskai()[ i ].getY() +  " "  + ( ( (Taskas3D ) kreive.getTaskai()[ i ]).getZ() )  );
			
			i++;
		}
		
		System.out.println ( "Kreives ilgis: " + kreive.ilgis() );												// ir parašomas suskaičiuotas kreivės ilgis		
	}

	public Kreive getKreive() {
		return kreive;
	}

	public void setKreive(Kreive kreive) {
		this.kreive = kreive;
	}
}
