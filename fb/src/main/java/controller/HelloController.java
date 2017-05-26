package controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("fbHelloController")
public class HelloController {


	@RequestMapping("/hello")
	public String helloworld(Model model) {

		model.addAttribute("username", "李四");

		return "hello";

	}
}