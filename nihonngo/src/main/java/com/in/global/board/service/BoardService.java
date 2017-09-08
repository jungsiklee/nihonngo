package com.in.global.board.service;

import java.util.List;

import com.in.global.board.vo.BoardAnswerVO;
import com.in.global.board.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> retrieveBoard();
	public List<BoardVO> retrieveBoardContent();
	public boolean writeBoard(BoardVO bvo);
	public boolean modifyBoard(BoardVO bvo);
	public boolean removeBoard(int boardSeq);
	public List<BoardAnswerVO> retrieveBoardAnswer(BoardVO bvo);
	public boolean writeBoardAnwser(BoardAnswerVO bavo);
	public boolean modifyBoardAnwser(BoardAnswerVO bavo);
	public boolean removeBoardAnwser(int boardAnswerSeq);
}
