package com.in.global.payment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in.global.payment.service.PaymentStateService;


@Controller
public class PaymentController {

	@Autowired
	private PaymentStateService pss;
		
	public void setPss(PaymentStateService pss) {
		this.pss = pss;
	}

	@RequestMapping()
	public String retrieveZzim(){
		
		return "/member/main";
	}
	
	@RequestMapping()
	public String writeZzim(){
		
		return "/member/main";
	}
	
	@RequestMapping()
	public String modifyZzim(){
		
		return "/member/main";
	}

	@RequestMapping()
	public String retrieveApply(){
		
		return "/member/main";
	}
	
	@RequestMapping()
	public String writeApply(){
		
		return "/member/main";
	}
	
	@RequestMapping()
	public String modifyApply(){
		
		return "/member/main";
	}

	@RequestMapping()
	public String retrievePay(){
		
		return "/member/main";
	}

	@RequestMapping()
	public String modifyPay(){
		
		return "/member/main";
	}
	
	@RequestMapping()
	public String modifyPayCancle(){
		
		return "/member/main";
	}
	
	@RequestMapping()
	public String modifyPaySuccess(){
		
		return "/member/main";
	}
	
	@RequestMapping()
	public String modifyStudySuccess(){
		
		return "/member/main";
	}
}

