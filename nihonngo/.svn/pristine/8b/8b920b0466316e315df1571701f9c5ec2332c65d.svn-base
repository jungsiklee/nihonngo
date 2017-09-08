package com.in.global.lesson.service;

import java.util.List;

import com.in.global.lesson.vo.CommentVO;
import com.in.global.lesson.vo.LessonVO;

public interface LessonService {
	
	public List<LessonVO> retrieveLessonList();
	
	public void studyLesson(String memberId, int lessonSeq);
	
	public boolean modifyPlayTime(String memberId, int lessonSeq, int paymentStateSeq);
	
	public List<CommentVO> retrieveBoardList();
	
	public boolean writeComment(String memberId, int lessonSeq, int commentSeq, String commentContent);
	
	public boolean modifyComment(String memberId, int lessonSeq, int commentSeq, String commentContent);
	
	public boolean removeComment(String memberId, int lessonSeq, int commentSeq);
}
