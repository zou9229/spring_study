import com.zou.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.zou.dao.UserDaoImpl;
//import com.zou.dao.UserDaoMysqlImpl;
//import com.zou.dao.UserDaoOracleImpl;
//import com.zou.service.UserService;
//import com.zou.service.UserServiceImpl;
//
//public class MyTest {
//    public static void main(String[] args) {
//
//        UserDaoImpl userDao = new UserDaoImpl();
//        //用户实际调用的是业务层，dao层他们不需要接触！
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//        userService.getUser();
//    }
//}
public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext；拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}