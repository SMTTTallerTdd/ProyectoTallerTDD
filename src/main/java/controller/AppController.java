package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smartmatic.tdd.word.WordUtils;

@Controller
public class AppController {

	@RequestMapping("/")
	public String home(@RequestParam String name){
		if(!WordUtils.isValidWord(name))
			return "home";
		else
			return "game";
	}
}
