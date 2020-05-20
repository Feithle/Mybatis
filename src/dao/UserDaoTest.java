package dao;

import entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    void test(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserDao userDao= (UserDao) ioc.getBean("mapperFactoryBean");
        User user=userDao.findUserById(1);
        System.out.println(user.getEmail());
    }
}