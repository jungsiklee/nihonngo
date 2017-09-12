package com.in.global.lesson.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in.global.lesson.vo.CommentVO;
import com.in.global.lesson.vo.LessonVO;


@Repository
public class LessonDAOImpl implements LessonDAO {
	@Autowired
	SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<LessonVO> selectLessonList() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void studyLesson(String memberId, int lessonSeq) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updatePlayTime(String memberId, int lessonSeq, int paymentStateSeq) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CommentVO> selectBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertComment(String memberId, int lessonSeq, int commentSeq, String commentContent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateComment(String memberId, int lessonSeq, int commentSeq, String commentContent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteComment(String memberId, int lessonSeq, int commentSeq) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<LessonVO> lessonList(int lectureSeq) {
		// TODO Auto-generated method stub
		List<LessonVO> list = sqlSession.selectList("lessonList", lectureSeq);
		
		return list;
	}

}
