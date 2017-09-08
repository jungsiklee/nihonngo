package com.in.global.cancel.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class CancelController {
	
	@RequestMapping()
	public String retrievePayCancel(){
		
		return "/member/main";
	}
	
	@RequestMapping()
	public String writePayCancel(){
		
		return "/member/main";
	}


}
