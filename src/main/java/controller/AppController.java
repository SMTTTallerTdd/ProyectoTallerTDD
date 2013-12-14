package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartmatic.tdd.word.WordUtils;

@Controller
public class AppController {

	@RequestMapping("/")
	public String home(org.springframework.web.context.request.WebRequest webRequest,ModelMap model){
		String name= webRequest.getParameter("word");
		if(name==null)
			return "home";
		WordUtils utils = new WordUtils();
		if(!utils.isValidWord(name)){
			model.addAttribute("error", "Palabra Inv&aacute;lida");
			return "home";				
		}
		else{
			model.addAttribute("name", name);
			return "game";
		}
			
	}
	
	@RequestMapping("/game")
	public String game(org.springframework.web.context.request.WebRequest webRequest,ModelMap model){
		String name= webRequest.getParameter("word");
		model.addAttribute("name", name);
		return "game";
	}
}
