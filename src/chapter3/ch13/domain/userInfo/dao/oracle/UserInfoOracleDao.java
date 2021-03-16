package chapter3.ch13.domain.userInfo.dao.oracle;

import chapter3.ch13.domain.userInfo.UserInfo;
import chapter3.ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userId =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update Oracle DB set userId =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete from Oracle DB userId =" + userInfo.getUserId());
    }
}
