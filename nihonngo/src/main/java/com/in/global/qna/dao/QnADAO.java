package com.in.global.qna.dao;

import java.util.List;

import com.in.global.qna.vo.QnAAnswerVO;
import com.in.global.qna.vo.QnAVO;

public interface QnADAO {
	
	public List<QnAVO> selectQnA();
	public List<QnAVO> selectQnAContent();
	public boolean insertQnA(QnAVO qvo);
	public boolean updateQnA(QnAVO qvo);
	public boolean deleteQnA(int qnaSeq);
	public List<QnAAnswerVO> selectQnAAnswer(QnAVO qvo);
	public boolean insertQnAAnswer(QnAAnswerVO qavo);
	public boolean updateQnAAnswer(QnAAnswerVO qavo);
	public boolean deleteQnAAnswer(int qnaAnswerSeq);
	
}
