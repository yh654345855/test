import com.huaxing.service.StudentService;
import com.huaxing.service.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestType {
    @Test
    public void show(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        StudentServiceImpl studentService= (StudentServiceImpl)ctx.getBean("StudentService") ;
        studentService.selectStudent();
    }
}
