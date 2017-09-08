package com.in.global.member.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.in.global.member.service.MemberService;
import com.in.global.member.service.MemberServiceImpl;

@Controller
//@SessionAttributes("userId")
@SessionAttributes({"userId","email","gender"})
public class MemberController {
	
	@Autowired
	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@RequestMapping("/member/login.do")
	public String login(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("/member/logout.do")
	public String logout(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("/member/join.do")
	public String join(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	@RequestMapping("/member/join.do")
	public String joinForm(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String delete(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String update(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String updateForm(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String memberSelectOne(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String memberSelectAll(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String gangSelectOne(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String gangSelectAll(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String gangMemberAll(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String id(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String pw(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("")
	public String lectureScoreWrite(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	

}
