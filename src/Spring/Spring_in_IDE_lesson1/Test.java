package Spring.Spring_in_IDE_lesson1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    String testName;

    Integer number;

    public static void show() {
//        Address address = new Address();
//        address.greetings("Joxa");
//        Employee employee = new Employee(address);
//        employee.show();

//        IoC Container
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

//        ApplicationContext factory =
//                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student)factory.getBean("studentbean");
        student.displayInfo();
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public Integer getNumber() {
        return number;
    }
}
