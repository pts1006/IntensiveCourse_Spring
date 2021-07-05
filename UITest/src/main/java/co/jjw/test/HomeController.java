package co.jjw.test;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.jjw.test.member.service.MemberService;
import co.jjw.test.member.vo.MemberVO;

@Controller
public class HomeController {
	
	@Autowired
	MemberService memberDao;
	
	@RequestMapping("home")
	public String home() {
		
		return "home";
	}
	
	// 회원 가입 페이지로 이동
	@RequestMapping("signUpPage")
	public String signUpPage() {
		
		return "signUp";
	}
	
	// 회원 가입 기능
	@RequestMapping("signUpForm")
	public String signUpForm() {
		
		return "home";
	}
	
	// 로그인 페이지로 이동
	@RequestMapping("signIn")
	public String signIn(HttpSession session) {
		
		String path = "";
		
		if (session.getAttribute("ID") == null) {
			
			path = "signIn";
		} else {
			
			path = "error";
		}
		
		return path;
	}
	
	// 로그인 과정
	@RequestMapping("signInForm")
	public String signInForm(Model model, MemberVO vo, HttpSession session) {
		
		String check = "";
		String path = "";
		
		String id = (String) session.getAttribute("ID");
		
		if(id != null) {
			
			check = "success";
			vo.setId(id);
			
		} else {
			
			vo = memberDao.memberSignIn(vo);
			
			if(vo == null) {
				
				check = "fail";
				path = "redirect:signIn";
			} else {
				
				check = "success";
				session.setAttribute("ID", vo.getId());
				path = "signInOk";
			}
			
		}
		
		model.addAttribute("check", check);
		model.addAttribute("member", vo);
		
		return path;
	}
	
	// 로그아웃
	@RequestMapping("signOut")
	public String signOut(HttpSession session) {
		
		session.invalidate();
		
		return "home";
	}
	
	// 회원리스트
	@RequestMapping("memberList")
	public String memberList(Model model) {
		
		model.addAttribute("list", memberDao.memberList());
		return "member/memberView";
	}
	
	// 회원 하나 조회
	@RequestMapping("memberSelect")
	public String memberSelect(MemberVO vo, Model model) {
		
		model.addAttribute("member", memberDao.memberSelect(vo));
		return "member/memberSelect";
	}
}
