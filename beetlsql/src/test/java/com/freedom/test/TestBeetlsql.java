package com.freedom.test;

import com.freedom.pojo.User;
import org.beetl.sql.core.*;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;

/**
 * Created by kuiyuxiang on 2017/4/14.
 */
public class TestBeetlsql {
    public static void main(String[] args) {
        String driver ="com.mysql.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/beetlsql";
        String userName= "root";
        String password = "123456";
        ConnectionSource source = ConnectionSourceHelper.getSimple(driver, url, userName, password);

        DBStyle mysql = new MySqlStyle();
        // sql语句放在classpagth的/sql 目录下
        SQLLoader loader = new ClasspathLoader("/sql");
        // 数据库命名跟java命名一样，所以采用DefaultNameConversion，还有一个是UnderlinedNameConversion，下划线风格的，
        UnderlinedNameConversion nc = new UnderlinedNameConversion();
        // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
        SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});

        //使用内置的生成的sql 新增用户，如果需要获取主键，可以传入KeyHolder
        User user = new User();
        user.setAge(19);
        user.setName("xiandafu");
        sqlManager.insert(user);

        //使用内置sql查询用户
        int id = 6;
        user = sqlManager.unique(User.class,id);
    }
}
