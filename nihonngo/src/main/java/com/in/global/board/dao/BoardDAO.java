package com.in.global.board.dao;

import java.util.List;

import com.in.global.board.vo.BoardAnswerVO;
import com.in.global.board.vo.BoardVO;

public interface BoardDAO {
	public List<BoardVO> selectBoard();
	public List<BoardVO> selectBoardContent();
	public boolean insertBoard(BoardVO bvo);
	public boolean updateBoard(BoardVO bvo);
	public boolean deleteBoard(int boardSeq);
	public List<BoardAnswerVO> selectBoardAnswer(BoardVO bvo);
	public boolean insertBoardAnwser(BoardAnswerVO bavo);
	public boolean updateBoardAnwser(BoardAnswerVO bavo);
	public boolean deleteBoardAnwser(int boardAnswerSeq);
	
}
