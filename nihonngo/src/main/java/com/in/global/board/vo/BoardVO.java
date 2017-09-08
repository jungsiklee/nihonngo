package com.in.global.board.vo;

import java.util.Date;

public class BoardVO {
	private int boardSeq;
	private int answerSeq;
	private int gangsaSeq;
	private String subject;
	private String memberId;
	private Date regDate;
	
	public int getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	public int getAnswerSeq() {
		return answerSeq;
	}
	public void setAnswerSeq(int answerSeq) {
		this.answerSeq = answerSeq;
	}
	public int getGangsaSeq() {
		return gangsaSeq;
	}
	public void setGangsaSeq(int gangsaSeq) {
		this.gangsaSeq = gangsaSeq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}
