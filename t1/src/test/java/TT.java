import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import slq.controller.StudentController;
import slq.mapper.StudentMapper;
import slq.pojo.Student;
import slq.service.StudentService;
import slq.service.StudentServiceImpl;

import java.io.IOException;
import java.io.InputStream;

//import org.springframework.transaction.interceptor.TransactionAttributeSource.isCandidateClass;
public class TT {
    public static void main(String[] args) {
        System.out.println("???????--------");
    }
    @Test
    public void tttt3() throws IOException {
        ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object s = c.getBean(StudentController.class);
        System.out.println(s);

    }

    @Test
    public void tttt2() throws IOException {
        ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ComboPooledDataSource s1 = (ComboPooledDataSource)c.getBean("dataSource");
//        String u=s1.getUser();
//        System.out.println(u);
        StudentService s = (StudentService) c.getBean(StudentServiceImpl.class);
        System.out.println(s);
        System.out.println(s.getStudent(2));


    }

    @Test
    public void tttt() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //初始化mybatis，创建SqlSessionFactory类实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //创建Session实例
        SqlSession session = sqlSessionFactory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        System.out.println(mapper.getOne(2));
    }
}
