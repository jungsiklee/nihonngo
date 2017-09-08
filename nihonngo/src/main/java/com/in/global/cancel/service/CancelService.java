package com.in.global.cancel.service;

import java.util.List;

import com.in.global.lesson.vo.LessonVO;

public interface CancelService {
	
	public List<LessonVO> retrievePayCancel();
	
	public boolean writePayCancel();

}
