import com.flying.services.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {
    @Autowired
    private AdminService adminService;

    @Test
    public void Demo(){
//        List<Admin> admins = adminService.selectAll();
//        for (Admin admin : admins) {
//            System.out.println(admin);
//        }
        System.out.println(adminService.selectByid(1));
        System.out.println(adminService.selectByid(1));
        System.out.println(adminService.selectByid(1));
        System.out.println(adminService.selectByid(1));
    }
}
