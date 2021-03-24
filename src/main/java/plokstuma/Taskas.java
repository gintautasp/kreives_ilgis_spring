
	package plokstuma;

	/**
	* Klase skirta plokstumos taško koordinačių x ir y reiksmiu saugojimui
	*/
	public class Taskas {
		
		protected double x;								// tasško x reikšmė
		protected double y;								// tasško y reikšmė
		
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

		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}	
		
	}