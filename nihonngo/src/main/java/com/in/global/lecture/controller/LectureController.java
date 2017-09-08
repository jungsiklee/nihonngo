package com.in.global.lecture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in.global.lecture.service.LectureService;

@Controller
public class LectureController {
	@Autowired 
	private LectureService lts;

	@RequestMapping
	public String writeLectureForm(){
		//작성폼 이동
		return null;		
	}
	@RequestMapping
	public String writeLecture(){
		//작성 이동
		return null;		
	}
	
	@RequestMapping
	public String modifyLectureForm(){
		//수정폼 이동
		return null;		
	}
	@RequestMapping
	public String modifyLecture(){
		//수정 이동
		return null;		
	}
	
	@RequestMapping
	public String deleteLecture(){
		//삭제
		return null;		
	}
	
	@RequestMapping
	public String selectLecture(){
		//강좌 목록 조회
		return null;		
	}
	
	@RequestMapping
	public String teacherLectureselect(){
		//강사의 강좌 목록 조회
		return null;		
	}
	
	@RequestMapping
	public String lectureRankingselect(){
		//강좌 랭킹 목록 조회
		return null;		
	}
	
	
	public void setLts(LectureService lts) {
		this.lts = lts;
	} 
	
	
}
