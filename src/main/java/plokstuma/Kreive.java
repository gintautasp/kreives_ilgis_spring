
	package plokstuma;
	
	import java.lang.Math;	
	
	/**
	* klasė kreivės taškų masyvo saugojimui ir veiksmų su kreive atlikimui
	*/
	public class Kreive {
	
		protected Taskas[] taskai;  														// kreivės taškų masyvas
		protected int kiek_tasku;														// kreivės taškų kiekis
		
		/**
		* konstruktorius, be parametrų
		*/		
		public Kreive() {
			
		}
		
		/**
		* konstruktorius, sukuria tuščia, taškų masyva, pagal nurodytą elementų skaičių
		*@param int max_tasku
		*/
		public Kreive ( int max_tasku ) {
			
			taskai = new Taskas [ max_tasku ];
			kiek_tasku = 0;
		}
		
		/**
		* papildo krevės taškų masyvą dar viena reikšme
		*@param Taskas taskas
		*/
		public void pridetiTaska ( Taskas taskas ) {
			
			taskai [ kiek_tasku ] = taskas;
			kiek_tasku++;
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
				
				atstumas += Math.sqrt ( x_diff  *  x_diff + y_diff * y_diff );
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
			
				    "-------------------------------\n" 
				+ "|      x       |       y      |\n"
				+ "-------------------------------\n";
			
			int i = 0;
			
			while ( i < kiek_tasku ) {

				lentele +=	 "|" + String.format ( "%10.3f", taskai [ i ].x ) + "    |" + String.format ( "%10.3f", taskai [ i ].y ) + "    |\n"; 
				i++;
			}
			lentele +=  "-------------------------------\n";
			
			return lentele;
		}

		public Taskas[] getTaskai() {
			return taskai;
		}

		public void setTaskai(Taskas[] taskai) {
			this.taskai = taskai;
		}

		public int getKiek_tasku() {
			
			return kiek_tasku;
		}

		public void setKiek_tasku(int kiek_tasku) {
			
			this.kiek_tasku = kiek_tasku;
		}
	}