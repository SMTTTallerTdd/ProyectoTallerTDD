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
			model.addAttribute("word", name);
			return "game";
		}
			
	}
	
	@RequestMapping("/game")
	public String game(org.springframework.web.context.request.WebRequest webRequest,ModelMap model){
		String word= webRequest.getParameter("word");
		
		String guess= webRequest.getParameter("guess");
		String letter =  webRequest.getParameter("letter");
		model.addAttribute("guess",guess);
		model.addAttribute("letter",letter);
		model.addAttribute("word", word);
		return "game";
	}
}
