package com.in.global.member.dao;

import java.util.List;

import com.in.global.member.vo.MemberVO;

public interface MemberDAO {
	
	public boolean insertMember();
	
	public boolean updateMember();
	
	public MemberVO selectOneMember();
	
	public List<MemberVO> selectAllMember();
	
	public MemberVO selectOneTeacher();
	
	public List<MemberVO> selectAllTeacher();
	
	public List<MemberVO> RetrieveAllStudent();
	
	public boolean deleteMember();
	
	public boolean login(MemberVO member);
	
	public boolean logout(MemberVO member);
	
	public String searchId(String email, String name);
	
	public String searchPw(String memberId, String email);
	
	public boolean lectureScoreInsert(String memberId, int lectureSeq, int lectureScore);
		
	
}
