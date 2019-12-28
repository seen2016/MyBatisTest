package com.mmall.batis;

import com.mmall.batis.pojo.UserInfo;
import com.mmall.batis.repository.UserInfoRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by Administrator on 2019/12/28.
 */
public class Testbatis {
    public static void main(String[] args) {
        InputStream inputStream = Testbatis.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserInfoRepository userInfoRepository = sqlSession.getMapper(UserInfoRepository.class);
        UserInfo userInfo = new UserInfo();
        userInfo.setAddress("北京");
        userInfo.setEmail("1231321@qq.com");
        userInfo.setMobile("18336009873");
        userInfo.setUserName("seen");
        userInfoRepository.add(userInfo);
        userInfoRepository.deleteById("1");
        sqlSession.commit();
        sqlSession.close();
    }
}
