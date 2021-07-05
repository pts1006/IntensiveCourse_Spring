package co.jjw.test.member.service;

import java.util.List;

import co.jjw.test.member.vo.MemberVO;

public interface MemberService {

	MemberVO memberSignIn(MemberVO vo);
	List<MemberVO> memberList();
	MemberVO memberSelect(MemberVO vo);
}
