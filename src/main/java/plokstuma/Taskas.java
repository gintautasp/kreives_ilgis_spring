
	package plokstuma;

	/**
	* Klase skirta plokstumos taško koordinačių x ir y reiksmiu saugojimui
	*/
	public class Taskas {
		
		public double x;								// tasško x reikšmė
		public double y;								// tasško y reikšmė
		
		/**
		* konstruktorius be parametrų
		*/
		public Taskas() {
		}
		
		/**
		* konstruktorius
		*@param double x_koord - taško x koordinatė
		*@param double y_koord - taško y koordinatė
		*/		
		public Taskas( double x_koord, double y_koord ) {
			
			x = x_koord;
			y = y_koord;
		}		
	}