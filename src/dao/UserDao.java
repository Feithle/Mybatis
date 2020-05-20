package dao;

import entity.User;

public interface UserDao {
    //根据用户id查询出用户的email和password
   public User findUserById(int id);
}
