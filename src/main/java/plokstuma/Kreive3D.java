package plokstuma;

public class Kreive3D extends Kreive {
	
	
	public Kreive3D() {
		
	}

	/**
	* konstruktorius, sukuria tuščia, taškų masyva, pagal nurodytą elementų skaičių
	*@param int max_tasku
	*/
	public Kreive3D ( int max_tasku ) {
		
		taskai = new Taskas [ max_tasku ];
		kiek_tasku = 0;
	}	
	
	/**
	* suskaičiuoja kreivės ilgį
	*@return double
	*/
	public double ilgis() {
		
		int i = 0;
		double atstumas = 0;
		
		while ( i < ( kiek_tasku - 1 ) ) {
			
			
		
			double x_diff =  taskai [ i ].x  - taskai [ i + 1 ].x;
			double y_diff =  taskai [ i ].y -  taskai [ i + 1 ].y;
			double z_diff = ( ( (Taskas3D) taskai [ i ] ).z ) -   ( ( (Taskas3D)  taskai [ i + 1 ]).z );
			
			atstumas += Math.sqrt ( x_diff  *  x_diff + y_diff * y_diff + z_diff * z_diff  );
			i++;
		}
		return atstumas;
	}
	
	/**
	* perrašomas standartinis java Object klasės metodas toString, skirtas parodyti kreivę, taškais pateikiant ASC II simboliais, lentelėje
	*@return String
	*/
	public String toString() {
		
		String lentele = 
		
			    "----------------------------------------------\n" 
			+ "|      x       |       y      |       z      |\n"
			+ "----------------------------------------------\n";
		
		int i = 0;
		
		while ( i < kiek_tasku ) {

			lentele +=	 "|" + String.format ( "%10.3f", taskai [ i ].x ) 
			 		+ "    |" + String.format ( "%10.3f", taskai [ i ].y ) 
			 		+ "    |" + String.format ( "%10.3f", ( (Taskas3D) taskai [ i ] ).z ) 			 		
			 		+ "    |\n"; 
			i++;
		}
		lentele +=  "----------------------------------------------\n";
		
		return lentele;
	}	

}
