package com.in.global.lecture.service;

import java.util.List;

import com.in.global.lesson.vo.LessonVO;

public interface LectureService {

	public boolean writeLecture();
	
	public boolean modifyLecture();
	
	public boolean removeLecture();
	
	public LessonVO retrieveLecture(String lectureId);
	
	public List<LessonVO> teacherList();
	
	public List<LessonVO> searchLectureRanking();
}
