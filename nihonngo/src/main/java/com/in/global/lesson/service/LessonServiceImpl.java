package com.in.global.lesson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.global.lesson.dao.LessonDAO;
import com.in.global.lesson.vo.CommentVO;
import com.in.global.lesson.vo.LessonVO;

@Service
public class LessonServiceImpl implements LessonService{
	
	@Autowired
	private LessonDAO lessonDAO;
	
	public void setLessonDAO(LessonDAO lessonDAO) {
		this.lessonDAO = lessonDAO;
	}

	@Override
	public List<LessonVO> retrieveLessonList(int lectureSeq) {
		// TODO Auto-generated method stub
		List<LessonVO> list = lessonDAO.lessonList(lectureSeq);
		return list;
	}

	@Override
	public void studyLesson(String memberId, int lessonSeq) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean modifyPlayTime(String memberId, int lessonSeq, int paymentStateSeq) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CommentVO> retrieveBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean writeComment(String memberId, int lessonSeq, int commentSeq, String commentContent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyComment(String memberId, int lessonSeq, int commentSeq, String commentContent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeComment(String memberId, int lessonSeq, int commentSeq) {
		// TODO Auto-generated method stub
		return false;
	}

}
