
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import component.EmployeeBean;

@Configuration
@ComponentScan("component")
public class MainApp {
    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainApp.class);

        EmployeeBean employee = context.getBean(EmployeeBean.class);

        logger.info("Fetching Employee Details...");
        employee.showEmployeeDetails();
    }
}
