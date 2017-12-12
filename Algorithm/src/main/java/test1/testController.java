package test1;

/**
 * @author 徐浩然
 * @version testController, 2017-10-13
 */


import com.yonyou.ifbp.context.InvocationInfoProxy;
import com.yonyou.ifbp.wb.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/test")
public class testController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(testController.class);

    @Autowired
    TestService testService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public volatile boolean flag;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
        InvocationInfoProxy.setTenantid("ec");

        jdbcTemplate.execute("UPDATE `example_demo` SET `num`='3' ");

        testService.ihashCode();
    }


        /**
         * 测试
         */
        public static void main(String[] args)
        {

        }

    private static void testSynchronization(){
        String s1 = "/usr/tmp";
        String s2 = s1.substring(4);

        System.out.println(s2);

    }
}
