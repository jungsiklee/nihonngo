package com.in.global.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in.global.board.service.BoardService;
import com.in.global.board.vo.BoardAnswerVO;
import com.in.global.board.vo.BoardVO;

public class BoardController {
	@Autowired private BoardService bs;
	
	@RequestMapping
	public String retrieveBoard(Model model){
		return null;
	}
	@RequestMapping
	public String retrieveBoardContent(Model model){
		return null;
	}
	@RequestMapping
	public String writeBoardForm(){
		//작성 폼으로 URL만 이동
		//DAO X
		return null;
	}
	@RequestMapping
	public String wirteBoard(BoardVO bvo){
		//작성 완료
		//insertBoard
		return null;
	}
	@RequestMapping
	public String modifyBoardForm(){
		//수정 폼으로 URL만 이동
		return null;
	}
	@RequestMapping
	public String modifyBoard(BoardVO bvo){
		//수정처리
		return null;
	}
	@RequestMapping
	public String deleteBoard(int boardSeq){
		return null;
	}
	@RequestMapping
	public String retrieveBoardAnswer(Model model, BoardVO bvo){
		return null;
	}
	@RequestMapping
	public String writeBoardAnswer(BoardAnswerVO bavo){
		//폼 x 작성 처리
		return null;
	}
	@RequestMapping
	public String modifyBoardAnswer(BoardAnswerVO bavo){
		//수정폼은 팝업
		//수정처리
		return null;
	}
	@RequestMapping
	public String deleteBoardAnswer(int boardAnswerSeq){
		return null;
	}
	public void setBs(BoardService bs) {
		this.bs = bs;
	}
	
	
	
	
	
	
}
