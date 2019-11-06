package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.dw.Ss;
import com.bw.service.SsService;

@Controller
public class Sscontroller {

	@Autowired
	private SsService ssService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Ss> list=ssService.list();
		model.addAttribute("list", list);
		return "list";
	}
}
