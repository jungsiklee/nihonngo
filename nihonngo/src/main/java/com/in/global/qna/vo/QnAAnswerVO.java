package com.in.global.qna.vo;

import java.util.Date;

public class QnAAnswerVO {
	
	private int qnaAnswerSeq;
	private int qnaSeq;
	private String qnaAnswerContent;
	private int memberSeq;
	private Date regDate;
	public int getQnaAnswerSeq() {
		return qnaAnswerSeq;
	}
	public void setQnaAnswerSeq(int qnaAnswerSeq) {
		this.qnaAnswerSeq = qnaAnswerSeq;
	}
	public int getQnaSeq() {
		return qnaSeq;
	}
	public void setQnaSeq(int qnaSeq) {
		this.qnaSeq = qnaSeq;
	}
	public String getQnaAnswerContent() {
		return qnaAnswerContent;
	}
	public void setQnaAnswerContent(String qnaAnswerContent) {
		this.qnaAnswerContent = qnaAnswerContent;
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
