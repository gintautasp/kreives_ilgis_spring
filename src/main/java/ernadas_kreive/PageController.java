package ernadas_kreive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping(path="/kreive")
    public String kreive( Model model ) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		KreivesIlgis ki = (KreivesIlgis) context.getBean( "mainspring" );
		
		try {
			
			ki.skaiciuojamKreivesIlgiWeb();
			model.addAttribute("kreive", ki.getKreive() );
			
		} catch ( Exception e ) {
			
		}
	
		return "labas";
	}

}
