import com.zou.pojo.Student;
import com.zou.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.toString());

        /*Student{
        name='邹',
        address=Address{address='武汉'},
        books=[红楼梦, 西游记, 水浒传, 三国演义],
        hobbys=[听歌, 敲代码, 看电影],
        card={身份证=111111222222223333, 银行卡=1231231231231231231},
        games=[LOL, COC, BOB],
        wife='null',
        info={姓名=小明, 学号=20210806, 性别=男}}
*/
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
