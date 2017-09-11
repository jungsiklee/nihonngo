package com.in.global.lecture.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in.global.lesson.vo.LessonVO;

@Repository
public class LectureDAOImple implements LectureDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public boolean insertLecture() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateLecture() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteLecture() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LessonVO searchLecture(String lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LessonVO> teacherList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LessonVO> searchLectureRanking() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	
	

}
