package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : hello.servlet.web.frontcontroller
 * fileName       : ModelView
 * author         : kanghyun Kim
 * date           : 2022/08/21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/21        kanghyun Kim      최초 생성
 */
public class ModelView {
    private String viewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
