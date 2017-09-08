package com.in.global.member.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.in.global.member.vo.MemberVO;

public interface MemberService {
	
	public boolean writeMember(MemberVO member); 
	
	public boolean modifyMember(MemberVO member);
	
	public MemberVO retrieveOneMember(String memberId);
	
	public List<MemberVO> retrieveAllMember();
	
	public MemberVO retrieveOneTeacher(MemberVO member);
	
	public List<MemberVO> retrieveAllTeacher();
	
	public List<MemberVO> retrieveAllStudent();
	
	public boolean removeMember(String memberId);
	
	public boolean login(MemberVO member);
	
	public boolean logout(MemberVO member);
	
	public String searchId(String email, String name);
	
	public String searchPw(String memberId, String email);
	
	public boolean lectureScoreWrite(String memberId, int lectureSeq, int lectureScore);
		
}
