package hello.servlet.web.frontcontroller.v5;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * packageName    : hello.servlet.web.frontcontroller.v5
 * fileName       : MyHandlerAdapter
 * author         : kanghyun Kim
 * date           : 2022/08/22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/22        kanghyun Kim      최초 생성
 */
public interface MyHandlerAdapter {

    boolean supports(Object handler);

    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
