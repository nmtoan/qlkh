package vn.cmu.ttcntt.qlkh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/")
	public String showTest(){
		return "test";
	}
}
