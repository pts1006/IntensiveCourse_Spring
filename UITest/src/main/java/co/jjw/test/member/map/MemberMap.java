package co.jjw.test.member.map;

import java.util.List;

import co.jjw.test.member.vo.MemberVO;

public interface MemberMap {

	MemberVO memberSignIn(MemberVO vo);
	List<MemberVO> memberList();
	MemberVO memberSelect(MemberVO vo);
}
