package ernadas_kreive;

import java.io.IOException;

import konsole.*;
import plokstuma.*;

public class KreivesIlgis {
	
	public KreivesIlgis() {
		
		
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
		String vardas_failo = konsoles_dialogas.ivestiReiksme (" kreives tasku failas", "kreives_taskai.csv" );	      			//  .. ką įvesti - " kreivės taškų failas "
																						
		KreiveIsFailoXXYY kreive_is_failo_xx_yy = new KreiveIsFailoXXYY ( vardas_failo ); 						// kuriams kreivės skaitymo iš failo objektas ..
		Kreive kreive = kreive_is_failo_xx_yy.gautiKreive();											// .. ir pasiimamas Kreives objektas, kuriame yra ..
																											//  .. Taskai masyvas

		System.out.println ( kreive.toString() );																	// parodomi kreivės taškai
		System.out.println ( "Kreives ilgis: " + kreive.ilgis() );												// ir parašomas suskaičiuotas kreivės ilgis		
	}

}
