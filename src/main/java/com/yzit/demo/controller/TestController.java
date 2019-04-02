package com.yzit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Controller
public class TestController {

	@RequestMapping("/test.do")
	public String test(){
		return "test";
	}
}
