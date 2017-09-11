package com.in.global.board.vo;

import java.util.Date;

public class BoardAnswerVO {
	private int boardAnswerSeq;
	private int boardSeq;
	private String boardAnswerContent;
	private int memberSeq;
	private Date regDate;
	
	public int getBoardAnswerSeq() {
		return boardAnswerSeq;
	}
	public void setBoardAnswerSeq(int boardAnswerSeq) {
		this.boardAnswerSeq = boardAnswerSeq;
	}
	public int getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getBoardAnswerContent() {
		return boardAnswerContent;
	}
	public void setBoardAnswerContent(String boardAnswerContent) {
		this.boardAnswerContent = boardAnswerContent;
	}
	
	public int getMemberSeq() {
		return memberSeq;
	}
	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}
