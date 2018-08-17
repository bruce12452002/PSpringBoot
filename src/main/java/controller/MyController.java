package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("*.xxx")
	@ResponseBody
	public Map<String, String> xxx() {
		Map<String, String> map = new HashMap<>();
		map.put("a", "aaa");
		map.put("b", "bbb");
		return map;
	}
}
