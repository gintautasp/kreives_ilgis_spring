package ernadas_kreive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping(path="/kreive")
    public String kreive() {
	
		return "labas";
	}

}
