package fac.pe.senac.appEvento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexConttroller {
	@RequestMapping("/appEvento")
	public String index() {
		return "footer";
	}
}
