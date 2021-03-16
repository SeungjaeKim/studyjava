package chapter3.ch13.domain.userInfo.dao.mysql;

import chapter3.ch13.domain.userInfo.UserInfo;
import chapter3.ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userId =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update MySQL DB set userId =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from  MySQL DB userId =" + userInfo.getUserId());
    }
}
