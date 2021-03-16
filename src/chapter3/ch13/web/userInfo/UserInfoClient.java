package chapter3.ch13.web.userInfo;

import chapter3.ch13.domain.userInfo.UserInfo;
import chapter3.ch13.domain.userInfo.dao.UserInfoDao;
import chapter3.ch13.domain.userInfo.dao.mysql.UserInfoMySqlDao;
import chapter3.ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/chapter3/ch13/db.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");

        UserInfoDao userInfoDao = null;
        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }else if(dbType.equals("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }else{
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
