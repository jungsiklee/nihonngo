package com.in.global.lesson.dao;

import java.util.List;

import com.in.global.lesson.vo.CommentVO;
import com.in.global.lesson.vo.LessonVO;

public interface LessonDAO {

	
public List<LessonVO> selectLessonList();
	
	public void studyLesson(String memberId, int lessonSeq);
	
	public boolean updatePlayTime(String memberId, int lessonSeq, int paymentStateSeq);
	
	public List<CommentVO> selectBoardList();
	
	public boolean insertComment(String memberId, int lessonSeq, int commentSeq, String commentContent);
	
	public boolean updateComment(String memberId, int lessonSeq, int commentSeq, String commentContent);
	
	public boolean deleteComment(String memberId, int lessonSeq, int commentSeq);
}
