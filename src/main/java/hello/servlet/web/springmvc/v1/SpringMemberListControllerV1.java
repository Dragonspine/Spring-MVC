package hello.servlet.web.springmvc.v1;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * packageName    : hello.servlet.web.springmvc.v1
 * fileName       : SpringMemberListControllerV1
 * author         : kanghyun Kim
 * date           : 2022/08/27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/27        kanghyun Kim      최초 생성
 */
@Controller
public class SpringMemberListControllerV1 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process() {
        List<Member> memberList = memberRepository.findAll();
        ModelAndView mv = new ModelAndView("members");
        mv.getModel().put("members", memberList);
        return mv;
    }

}
