package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

/**
 * packageName    : hello.servlet.web.frontcontroller.v4.controller
 * fileName       : MemberFormControllerV4
 * author         : kanghyun Kim
 * date           : 2022/08/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/21        kanghyun Kim      최초 생성
 */
public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
