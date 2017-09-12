package com.in.global.lesson.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.in.global.lesson.service.LessonService;
import com.in.global.lesson.vo.LessonVO;

public class LessonController {
	

	@Autowired
	LessonService lessonService;

	public void setLessonService(LessonService lessonService) {
		this.lessonService = lessonService;
		//aaa
	}
	
	@RequestMapping("/lesson/lessonList.do")
	public String lessonList(@RequestParam int lessonSeq,Model model){
		//aaa
		ArrayList<LessonVO> lessonList = (ArrayList<LessonVO>) lessonService.retrieveLessonList(lessonSeq);
		model.addAttribute("lessonList", lessonList);
		return "/lesson/lessonList";
	}
	
	@RequestMapping("/lesson/studyLesson.do")
	public String studyLesson(@RequestParam String userId,@RequestParam String password,Model model){
		//aaa
		return "/member/main";
	}
	
	@RequestMapping("/lesson/insertPlayTime.do")
	public String insertPlayTime(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("/lesson/insertComment.do")
	public String insertComment(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("/lesson/updateComment.do")
	public String updateComment(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
	@RequestMapping("/lesson/removeComment.do")
	public String removeComment(@RequestParam String userId,@RequestParam String password,Model model){
		
		return "/member/main";
	}
	
}
