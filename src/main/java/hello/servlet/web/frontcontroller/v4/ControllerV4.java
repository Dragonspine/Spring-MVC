package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * packageName    : hello.servlet.web.frontcontroller.v4
 * fileName       : ControllerV4
 * author         : kanghyun Kim
 * date           : 2022/08/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/22        kanghyun Kim      최초 생성
 */
public interface ControllerV4 {

    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
