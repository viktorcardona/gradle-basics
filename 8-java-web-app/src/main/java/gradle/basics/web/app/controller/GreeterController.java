package gradle.basics.web.app.controller;

import gradle.basics.web.app.service.GreeterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class GreeterController {
	
	private final GreeterService greeterService;

	@Autowired
	public GreeterController(GreeterService greeterService) {
		this.greeterService = greeterService;
	}

	@RequestMapping("/greet")
	public String greet(Model model) {
		log.info("Executing /greet...");
		model.addAttribute("greetingPhrase", greeterService.getGreet());
		return "greet";
	}

}
