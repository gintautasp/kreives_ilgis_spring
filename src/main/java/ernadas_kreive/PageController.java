package ernadas_kreive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import plokstuma.Taskas3D;

@Controller
public class PageController {

	@RequestMapping(path="/kreive", method={ RequestMethod.GET, RequestMethod.POST })
    public String kreive( 
    		@RequestParam(name="x", required=false, defaultValue="0.0") String x
    		, @RequestParam(name="y", required=false, defaultValue="0.0") String y
    		, @RequestParam(name="z", required=false, defaultValue="0.0") String z
    		, @RequestParam(name="rasti_atstuma", required=false, defaultValue="neskaiciuoti") String skaiciuoti
    		, Model model ) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		KreivesIlgis ki = (KreivesIlgis) context.getBean( "mainspring" );
		String err_msg = "";
		
		try {
			
			Taskas3D taskas3d = new Taskas3D(  0, 0, 0  );			
			
			if ( ( skaiciuoti != null )  && ( skaiciuoti.equals( "skaiciuoti") ) ) {
				
				try {
				
					Double x_sk = Double.parseDouble( x );
					Double y_sk = Double.parseDouble( y );
					Double z_sk = Double.parseDouble( z );
					
					taskas3d = new Taskas3D(  x_sk, y_sk, z_sk  );
												
				} catch ( Exception e ) {
					
					err_msg = "blogai įvestos koordinatės";
				}
			

				
			} 
			
			ki.skaiciuojamKreivesIlgiWeb();
			model.addAttribute("kreive", ki.getKreive() );
			model.addAttribute("taskas", taskas3d );
			model.addAttribute("err_msg", err_msg );			

			
		} catch ( Exception e ) {
			
		}
	
		return "labas";
	}

}
