package com.in.global.lecture.dao;

import java.util.List;

import com.in.global.lesson.vo.LessonVO;

public interface LectureDAO {
	
	public boolean insertLecture();
	
	public boolean updateLecture();
	
	public boolean deleteLecture();
	
	public LessonVO searchLecture(String lectureId);
	
	public List<LessonVO> teacherList();
	
	public List<LessonVO> searchLectureRanking();
	
	
}
