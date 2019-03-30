package com.hkj.jdbc.chap03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hkj.jdbc.example.ArticleService;

/**
 * MemberRegisterService를 테스트한다.<br>
 * new를 사용해서 직접 인스턴스를 생성한다.
 * 
 * @author Jacob
 */
public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao); 
		
		/* ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService", com.hkj.jdbc.chap03.MemberRegisterService.class);
		*/

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("ghkdrbwjd369@naver.com.com");
		req.setPassword("xxxx");
		req.setName("hkj");

		// 회원 등록
		regService.regist(req);
	}
}