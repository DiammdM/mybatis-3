package org.apache.ibatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.test.entity.SysUser;
import org.apache.ibatis.test.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;

/**
 * SqlTest
 *
 * @author: Diammd
 * @since: 2024/6/2
 */
public class SqlTest {
  public static void main(String[] args) throws IOException {
    InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    try (SqlSession session = sqlSessionFactory.openSession()) {
      UserMapper mapper = session.getMapper(UserMapper.class);
      List<SysUser> list = mapper.getList();
      System.out.println(list);
    }

  }
}
