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
			String word= webRequest.getParameter("word");
			String guess= webRequest.getParameter("guess");
			if(guess==null)
				guess=utils.fillGuess(word);
			model.addAttribute("opportunities", 4);			
			model.addAttribute("guess",guess);
			model.addAttribute("guessVisual",guess);
			model.addAttribute("word", word);
			return "game";
		}
			
	}
	
	@RequestMapping("/game")
	public String game(org.springframework.web.context.request.WebRequest webRequest,ModelMap model){
		String word= webRequest.getParameter("word");
		String guess= webRequest.getParameter("guess");
		String letter =  webRequest.getParameter("letter");
		int oportunities = Integer.parseInt(webRequest.getParameter("opportunities"));

		String goodLetter = "";
		WordUtils utils = new WordUtils();
		
		if(guess==null)
			guess=utils.fillGuess(word);
		
		if(letter!=null){
			goodLetter=replaceLetters(guess,word,letter);
		}
		
		if(!goodLetter.equals("YES"))
			oportunities --;			
		model.addAttribute("guess",guess);
		model.addAttribute("guessVisual",guess);
		model.addAttribute("letter",letter);
		model.addAttribute("opportunities", oportunities);			
		model.addAttribute("word", word);
		model.addAttribute("goodletter", goodLetter);
		return "game";
	}

	private String replaceLetters(String guess, String word, String letter) {
		
		if(!word.contains(letter))
			return "NO";
		
		StringBuilder myName = new StringBuilder(guess);
		myName.setCharAt(word.indexOf(letter),letter.charAt(0));
		guess = myName.toString();
		return "YES";
	}
}
