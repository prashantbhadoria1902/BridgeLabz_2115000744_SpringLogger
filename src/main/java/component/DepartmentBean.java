package component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName = "IT";

    public String getDeptName() {
        return deptName;
    }
}
