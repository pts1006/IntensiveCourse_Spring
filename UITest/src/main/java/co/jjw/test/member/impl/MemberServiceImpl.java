package co.jjw.test.member.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.jjw.test.member.map.MemberMap;
import co.jjw.test.member.service.MemberService;
import co.jjw.test.member.vo.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMap map;
	
	@Override
	public MemberVO memberSignIn(MemberVO vo) {
		// 로그인
		return map.memberSignIn(vo);
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO 하나 조회
		return map.memberSelect(vo);
	}

	@Override
	public List<MemberVO> memberList() {
		// 전체 조회
		return map.memberList();
	}

}
