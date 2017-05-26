package fa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("faHelloController")
public class HelloController {


	@RequestMapping("/helloA")
	public String helloworld(Model model) {

		model.addAttribute("username", "fa模块");

		return "hello";

	}
}