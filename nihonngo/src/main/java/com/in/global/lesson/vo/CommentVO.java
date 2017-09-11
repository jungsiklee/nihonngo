package com.in.global.lesson.vo;

import java.util.Date;

public class CommentVO {
	
	private int commentSeq;
	private String commentContent;
	private Date regDate;
	private int memberSeq;
	private int lessonSeq;
	public int getCommentSeq() {
		return commentSeq;
	}
	public void setCommentSeq(int commentSeq) {
		this.commentSeq = commentSeq;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getMemberSeq() {
		return memberSeq;
	}
	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}
	public int getLessonSeq() {
		return lessonSeq;
	}
	public void setLessonSeq(int lessonSeq) {
		this.lessonSeq = lessonSeq;
	}
	
	
	
}
