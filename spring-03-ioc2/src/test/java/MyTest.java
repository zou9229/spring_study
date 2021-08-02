import com.zou.pojo.User;
import com.zou.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //Spring容器，就类似于婚介网站

        //可以读取多个配置文件，但通常通过import合并
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml","applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("userNew");
        System.out.println(user == user1);

        user.show();

        UserT user2=(UserT) context.getBean("u3");
        user2.show();
    }
}
