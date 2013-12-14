package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartmatic.tdd.word.WordUtils;

@Controller
public class AppController {

	@RequestMapping("/")
	public String home(@RequestParam("name")String name,ModelMap model){
		WordUtils utils = new WordUtils();
		if(!utils.isValidWord(name)){
			model.addAttribute("error", name);
			return "home";				
		}
		else{
			model.addAttribute("name", name);
			return "game";
		}
			
	}
}
