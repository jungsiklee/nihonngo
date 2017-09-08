package com.in.global.qna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.in.global.lecture.QnAVO;
import com.in.global.qna.service.QnAService;
import com.in.global.qna.vo.QnAAnswerVO;

public class QnAController {
	
	@Autowired
	private QnAService qs;
	
	public String retrieveQnA(Model model){
		
		return null;
	}
	public String retrieveQnAContent(Model model){
		
		return null;
	}
	public String writeQnAForm(){
		//작성폼 URL 이동
		return null;
	}
	public String writeQnA(QnAVO qvo){
		//작성처리
		return null;
	}
	public String modifyQnAForm(){
		//수정폼 이동
		return null;
	}
	public String modifyQnA(QnAVO qvo){
		//수정처리
		return null;
	}
	public String deleteQnA(int qnaSeq){
		
		return null;
	}
	public String retrieveQnAAnswer(Model model, QnAVO qvo){
		
		return null;
	}
	public String writeQnAAnswer(QnAAnswerVO qavo){
		
		return null;
	}
	public String modifyQnAAnswer(QnAAnswerVO qavo){
		
		return null;
	}
	public String deleteQnAAnswer(int qnaAnswerSeq){
		
		return null;
	}











	public void setQs(QnAService qs) {
		this.qs = qs;
	}
	
	
}

