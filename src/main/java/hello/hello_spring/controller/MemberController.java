package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 스프링 빈은 생성하면 싱글톤으로 생성된다.
public class MemberController {

    private final MemberService memberService ;

    @Autowired  // 자동으로 연결, 생성자가 1개만 있으면 @Autowired 생략 가능
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
