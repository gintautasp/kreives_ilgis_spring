
	package plokstuma;
	
	import java.io.BufferedReader; 
	import java.io.IOException; 

	import java.io.FileReader;	
	
	public class KreiveIsFailoXY extends KreiveIsFailo {
	
		public KreiveIsFailoXY ( String failo_vardas ) {
			
			vardas_failo = failo_vardas;
		}
		
		public Kreive gautiKreive() {
			
			Kreive kreive = new Kreive();
			
			try {

				BufferedReader br = new BufferedReader( new FileReader( vardas_failo ) ); 
				
				int kreives_tasku_skaicius = Integer.parseInt( br.readLine() );
				
				kreive = new Kreive ( kreives_tasku_skaicius );
				
				String x_y_z = "";
				
				while ( ( x_y_z = br.readLine() ) != null ) {
					
					String[] xs_ys_zs = x_y_z.split ( "," );
					kreive.pridetiTaska ( new Taskas ( 
							Double.parseDouble ( xs_ys_zs [ 0 ] )
							, Double.parseDouble ( xs_ys_zs [ 1 ] )
							// ,  Double.parseDouble ( xs_ys_zs [ 2 ] )
					) );
				}
				
				
			} catch ( Exception e ) {
				
				e.printStackTrace();
			}
			return kreive;			
		}
	}