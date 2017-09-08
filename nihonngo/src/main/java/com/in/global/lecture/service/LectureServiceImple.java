package com.in.global.lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.global.lecture.dao.LectureDAO;
import com.in.global.lesson.vo.LessonVO;
import com.in.global.member.dao.MemberDAO;

@Service("lectureServiceImpl")
public class LectureServiceImple implements LectureService {

	@Autowired
	private LectureDAO ldao;
	
	@Override
	public boolean writeLecture() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyLecture() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeLecture() {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public List<LessonVO> teacherList() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setLdao(LectureDAO ldao) {
		this.ldao = ldao;
	}

	@Override
	public LessonVO retrieveLecture(String lectureId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LessonVO> searchLectureRanking() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
