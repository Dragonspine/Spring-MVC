package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

/**
 * packageName    : hello.servlet.web.frontcontroller.v3
 * fileName       : ControllerV3
 * author         : kanghyun Kim
 * date           : 2022/08/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/21        kanghyun Kim      최초 생성
 */
public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
